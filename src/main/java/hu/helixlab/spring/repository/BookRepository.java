package hu.helixlab.spring.repository;

import hu.helixlab.spring.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{


//	@Query(value = "SELECT b From Book where b.id > :id")
//	List<Book> findAllById(@Param("id") String id);

}
