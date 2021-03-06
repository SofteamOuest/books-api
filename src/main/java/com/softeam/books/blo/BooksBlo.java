package com.softeam.books.blo;

import com.softeam.books.dao.BooksDao;
import com.softeam.books.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by elkouhen on 02/07/17.
 */
@Component
@Transactional
public class BooksBlo {

    @Autowired
    private BooksDao booksDao;

    public Collection<BookDto> findAll() {

        return booksDao.findAll();
    }
}
