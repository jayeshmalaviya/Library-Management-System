package com.SpringProject.librarymanagementsystem.Controller;

import com.SpringProject.librarymanagementsystem.DTO.AuthorRequestDto;
import com.SpringProject.librarymanagementsystem.DTO.AuthorResponseDto;
import com.SpringProject.librarymanagementsystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;


    @PostMapping ("/add")
    public String addAuthor(@RequestBody  AuthorRequestDto authorRequestDto){

        authorService.addAuthor(authorRequestDto);
        return "Author added successfully";
    }

    @GetMapping ("/getAuthor")
    public AuthorResponseDto getAuthor(@RequestParam("authorId")Integer authorId){
        return authorService.getAuthor(authorId);
    }
}
