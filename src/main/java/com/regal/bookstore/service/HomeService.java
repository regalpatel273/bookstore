package com.regal.bookstore.service;

import com.regal.bookstore.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Author> getALlAuthors(){

        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1,"Mr. X","","abc");
        Author author2 = new Author(2,"Mr. Y","","abc");
        Author author3 = new Author(3,"Mr. Z","","abc");

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        return authors;
    }

    public List<Author> searchedAuthors(String authorName){

        List<Author> searchedAuthor = new ArrayList<>();

        Author author = new Author(1,authorName,"","");

        searchedAuthor.add(author);


        return searchedAuthor;
    }

}
