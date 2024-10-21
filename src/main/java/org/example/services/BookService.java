package org.example.services;

import org.example.models.Book;
import org.example.models.Person;
import org.example.repositories.BookRepository;
import org.example.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public Person getBookOwner(int bookId) {
        return bookRepository.findById(bookId)
                .map(Book::getOwner)
                .orElse(null);
    }


    public void release(int bookId) {
        bookRepository.findById(bookId).ifPresent(book -> {
           book.setOwner(null);
           bookRepository.save(book);
        });
    }

    @Transactional
    public void assign(int id, Person selectedPerson) {
        bookRepository.findById(id).ifPresent(
                book -> {
                    book.setOwner(selectedPerson);
                }
        );
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findOne(int id) {
        Optional<Book> person = bookRepository.findById(id);
        return person.orElse(null);
    }

    @Transactional
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Transactional
    public void update(int id, Book newBook) {
        newBook.setId(id);
        bookRepository.save(newBook);
    }

    @Transactional
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
