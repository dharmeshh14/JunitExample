package LibraryManagement;

import java.util.List;

public interface LibraryRecordRepository {
    public List<Library> findByBook(Book book);
    public boolean save(Library library);
}
