package com.czetsuya;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.czetsuya.business.data.entity.Book;
import com.czetsuya.data.repository.BookRepository;

@SpringBootTest
class JpaToSpringEventsApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void whenCreateUpdateRemoveBook_thenOk() {
        Book book = new Book();
        book.setName("Mahouka Koukou");
        bookRepository.save(book);

        book.setName("Gate Jietai");
        bookRepository.save(book);

        bookRepository.delete(book);
    }

}
