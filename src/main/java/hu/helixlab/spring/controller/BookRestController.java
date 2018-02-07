package hu.helixlab.spring.controller;

import hu.helixlab.spring.domain.Book;
import hu.helixlab.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public Book findById(@PathVariable("id") int id){

		return bookService.findById(id);
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Book createBook(@RequestBody Book book){

		return bookService.save(book);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public void deleteBookById(@PathVariable("id") int id){
		bookService.deleteById(id);
	}


	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	 public Book updateBookById(@PathVariable("id") int id, @RequestBody Book book){
		return bookService.updateById(id, book);
	}

	//find all
	//
}
