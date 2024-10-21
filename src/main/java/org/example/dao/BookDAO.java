package org.example.dao;

import org.example.models.Book;
import org.example.models.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {

//    private final JdbcTemplate jdbcTemplate;
//
//    public BookDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Book> index() {
//        String SQL = "SELECT * FROM Book";
//        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Book.class));
//    }
//    public void save(Book book) {
//        String SQL = "INSERT INTO Book (name, author, year) VALUES (?,?,?)";
//        jdbcTemplate.update(SQL, book.getName(), book.getAuthor(), book.getYear());
//    }
//
//    public Book show(int id) {
//        String SQL = "SELECT * FROM Book WHERE id=?";
//        return jdbcTemplate.query(SQL, new Object[]{id}, new BeanPropertyRowMapper<>(Book.class)).stream()
//                .findAny().orElse(null);
//    }
//
//    public void update(Book anotherBook, int id) {
//        String SQL = "UPDATE Book SET name=?, author=?, year=? WHERE id=?";
//        jdbcTemplate.update(SQL, anotherBook.getName(), anotherBook.getAuthor(), anotherBook.getYear(), id);
//    }
//
//    public void delete(int id) {
//        String SQL = "DELETE FROM Book WHERE id=?";
//        jdbcTemplate.update(SQL, id);
//    }
//
//    public Optional<Person> getBookOwner(int id) {
//        return jdbcTemplate.query("SELECT Person.* FROM Book JOIN Person ON Book.person_id = Person.id " +
//                        "WHERE Book.id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
//                .stream().findAny();
//    }
//
//    public void release(int id) {
//        jdbcTemplate.update("UPDATE Book SET person_id=NULL WHERE id=?", id);
//    }
//
//    public void assign(int id, Person selectedPerson) {
//        jdbcTemplate.update("UPDATE Book SET person_id=? WHERE id=?", selectedPerson.getId(), id);
//    }

}
