package com.example.demo.repository;

import com.example.demo.model.Content;
import com.example.demo.model.Type;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContentRepository extends CrudRepository<Content, Integer> {

    // Spring Data generates the SQL from the method name automatically
    List<Content> findAllByType(Type type);

    @Query("SELECT * FROM content WHERE status = :status")
    List<Content> findAllByStatus(String status);
}
