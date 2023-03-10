package book.bookmanage.repository;

import java.util.List;
import java.util.Optional;

import book.bookmanage.domain.Book;

public class BookMemoryRepository implements BookRepository{

	@Override
	public Book save(String title, String category, long price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findTitle(String title) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Book> findCategory(String category) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Book> findPrice(long price) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
