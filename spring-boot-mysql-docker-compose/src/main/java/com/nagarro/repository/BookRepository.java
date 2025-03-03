package com.nagarro.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
