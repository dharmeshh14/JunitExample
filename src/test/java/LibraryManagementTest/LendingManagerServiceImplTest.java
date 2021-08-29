package LibraryManagementTest;
import static org.mockito.Matchers.any;
import LibraryManagement.Book;
import LibraryManagement.LendingManagerServiceImpl;
import LibraryManagement.Library;
import LibraryManagement.LibraryRecordRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Date;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.mockito.Mockito.*;

public class LendingManagerServiceImplTest {
    @InjectMocks
    private LendingManagerServiceImpl managerService;

    @Mock
    Book book;
    @Mock
    Library oldRecord;
    @Mock
    Library newRecord;
    @Mock
    LibraryRecordRepository libraryRecordRepository;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        when(oldRecord.getBorrowingDate()).thenReturn(new Date());
        when(oldRecord.getReturningDate()).thenReturn(new Date());
        when(newRecord.getReturningDate()).thenReturn(new Date());
        when(libraryRecordRepository.save(any(Library.class))).thenReturn(true);

    }
    @Test
    public void borrowBookTest(){
        managerService.borrowBook(book);
        //when(managerService.setLibraryRecordRepository(book)).thenReturn(book);
        //verify(libraryRecordRepository, times(1)).findByBook(book);

    }
    @Test(expected = IllegalStateException.class)
    public void unreturnedBookCanNotBeBorrowed() {
        when(libraryRecordRepository.findByBook(book)).thenReturn(Arrays.asList(oldRecord, newRecord));
        managerService.borrowBook(book);
    }
    @Test
    public void returnBookTest(){
        when(libraryRecordRepository.findByBook(book)).thenReturn(Arrays.asList(oldRecord,newRecord));
        managerService.returnBook(book);
       // verify(managerService, times(1)).findByBook(book);
       // verify(managerService, times(1)).save(any(Library.class));
    }
}
