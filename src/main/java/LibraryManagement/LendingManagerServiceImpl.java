package LibraryManagement;
import javax.inject.Inject;
import java.util.Date;
import java.util.List;

public class LendingManagerServiceImpl implements LendingManger{

    @Inject
    LibraryRecordRepository libraryRecordRepository;


    public void setLibraryRecordRepository(LibraryRecordRepository repository){
       libraryRecordRepository=repository;
    }
 @Override
 public Library borrowBook(Book book){
        List<Library> records=checkRecordIntegrity(libraryRecordRepository.findByBook(book));
        for(Library record:records){
            if(record.getReturningDate()==null){
                throw new IllegalStateException("This Book is not return yet");
            }
        }
        Library record=new Library();
        record.setBook(book);
        record.setBorrowingDate(new Date());
        if(!libraryRecordRepository.save(record)){
            throw new IllegalStateException("New library record can't be saved.");
        }
        return record;
 }

    @Override
    public Library returnBook(Book book) {
        List<Library> records=checkRecordIntegrity(libraryRecordRepository.findByBook(book));
        for(Library record:records){
            if(record.getReturningDate()==null){
                record.setReturningDate(new Date());
                 if(!libraryRecordRepository.save(record)){
                     throw new IllegalStateException("New library record can't be saved.");

                 }
            }
            return record;
        }
        throw new IllegalStateException("This book is not borrowed.");
    }

    private List<Library> checkRecordIntegrity(List<Library> records) {
        int emptyReturningDates = 0;
        for (Library record : records) {
            if (record.getBorrowingDate() == null)
                throw new IllegalStateException("Empty borrowing date is found.");

            if (record.getReturningDate() == null)
                emptyReturningDates++;
        }

        if (emptyReturningDates > 1)
            throw new IllegalStateException("Multiple returning dates are empty.");

        return records;
    }


}
