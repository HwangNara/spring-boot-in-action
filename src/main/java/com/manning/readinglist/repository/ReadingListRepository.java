package com.manning.readinglist.repository;

import com.manning.readinglist.entity.Book;
import com.manning.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dany on 2017. 5. 31..
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(Reader reader);
}
