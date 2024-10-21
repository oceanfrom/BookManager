package org.example.dao;

import org.example.models.Book;
import org.example.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDAO {

//    private final JdbcTemplate jdbcTemplate;
//
//
//    public PersonDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Person> index() {
//        String SQL = "SELECT * FROM Person";
//        return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<>(Person.class));
//    }
//
//    public Person show(int id) {
//        String SQL = "SELECT * FROM Person WHERE id=?";
//        return jdbcTemplate.query(SQL, new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
//                .stream().findAny().orElse(null);
//    }
//
//    public void save(Person person) {
//        String SQL = "INSERT INTO Person(fullName, yearOfBirth) VALUES (?,?)";
//        jdbcTemplate.update(SQL, person.getFullName(), person.getYearOfBirth());
//    }
//
//    public void update(int id, Person anotherPerson) {
//        String SQL = "UPDATE Person SET fullName=?, yearOfBirth=? WHERE id=?";
//        jdbcTemplate.update(SQL, anotherPerson.getFullName(), anotherPerson.getYearOfBirth(), id);
//    }
//
//
//    public void delete(int id) {
//        String SQL = "DELETE FROM Person WHERE id=?";
//        jdbcTemplate.update(SQL, id);
//    }
//
//    public List<Book> getBooksByPersonId(int id) {
//        String SQL = "SELECT * FROM Book WHERE person_id = ?";
//        return jdbcTemplate.query(SQL, new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
//    }

}
