package com.SpringProject.librarymanagementsystem.Repository;

import com.SpringProject.librarymanagementsystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
