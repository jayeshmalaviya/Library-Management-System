package com.SpringProject.librarymanagementsystem.DTO;

import com.SpringProject.librarymanagementsystem.Entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorResponseDto {
    private String name;

    private String email;

    private List<BookResponseDto> books;
}
