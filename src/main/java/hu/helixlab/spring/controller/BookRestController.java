package hu.helixlab.spring.controller;

import hu.helixlab.spring.domain.Book;
import hu.helixlab.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;



	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public Book getTestBook(){
		return bookService.getTestBook();
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public void createBook(){

	}
}
