package com.manning.readinglist.repository;

import com.manning.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dany on 2017. 6. 1..
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
