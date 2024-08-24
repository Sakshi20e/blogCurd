package com.curd.blogcurd.dao;

import com.curd.blogcurd.model.BlogModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogDao extends CrudRepository<BlogModel, Integer> {
    @Override
    List<BlogModel> findAll();
}

