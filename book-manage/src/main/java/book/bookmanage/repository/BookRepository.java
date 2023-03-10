package book.bookmanage.repository;

import java.util.List;
import java.util.Optional;

import book.bookmanage.domain.Book;

public interface BookRepository {
	
	Book save(String title, String category, long price);
	
	Optional<Book> findTitle(String title);
	Optional<Book> findCategory(String category);
	Optional<Book> findPrice(long price);
	
	List<Book> findAll();
	
}
