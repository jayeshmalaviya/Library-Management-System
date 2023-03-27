package com.SpringProject.librarymanagementsystem.Service;

import com.SpringProject.librarymanagementsystem.DTO.AuthorRequestDto;
import com.SpringProject.librarymanagementsystem.DTO.AuthorResponseDto;
import com.SpringProject.librarymanagementsystem.DTO.BookResponseDto;
import com.SpringProject.librarymanagementsystem.Entity.Author;
import com.SpringProject.librarymanagementsystem.Entity.Book;
import com.SpringProject.librarymanagementsystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(AuthorRequestDto authorRequestDto){

        Author author = new Author();

        //we are setting its attribute so that we can save
        //correct values in the db.
        author.setName(authorRequestDto.getName());
        author.setAge(authorRequestDto.getAge());
        author.setEmail(authorRequestDto.getEmail());

        authorRepository.save(author);
        return "Author added successfully";
    }

    public AuthorResponseDto getAuthor(Integer authorId){

        Author author =  authorRepository.findById(authorId).get();
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        //Set its attributes.
        //List<Book> --> List<BookResponseDto>
        List<Book> bookList = author.getBooks();

        List<BookResponseDto> booksWrittenDto = new ArrayList<>() ;

        for(Book b : bookList){

            BookResponseDto bookResponseDto = new BookResponseDto();
            bookResponseDto.setTitle(b.getTitle());
            bookResponseDto.setPrice(b.getPrice());
            bookResponseDto.setPrice(b.getPrice());

            booksWrittenDto.add(bookResponseDto);
        }

        //Set attributes for authorResponse Dto
        authorResponseDto.setBooks(booksWrittenDto) ;
        authorResponseDto.setName(author.getName());
        authorResponseDto.setEmail(author.getEmail());

        return authorResponseDto;
    }

}
