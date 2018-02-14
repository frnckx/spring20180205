package hu.helixlab.spring.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String isbn;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Category> categories = new HashSet<>();


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_author",
			joinColumns = @JoinColumn(name = "book_id"),
			inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book addCategory(Category category){
		this.categories.add(category);
		return this;
	}

	public Book addAuthor(Author author){
		this.authors.add(author);
		return this;
	}








	//	@ManyToMany(cascade = CascadeType.ALL)
	//	@JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	//	private  Set<PreAuthor> authors = new HashSet<>();

//	public Set<PreCategory> getCategories() {
//		return categories;
//	}
//
//	public Set<PreAuthor> getAuthors() {
//		return authors;
//	}
//
//	public void setAuthors(Set<PreAuthor> authors) {
//		this.authors = authors;
//	}
//
//	public Book addAuthor(PreAuthor a){
//		authors.add(a);
//		return this;
//	}

}
