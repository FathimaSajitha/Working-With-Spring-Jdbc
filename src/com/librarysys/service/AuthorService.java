package com.librarysys.service;

import java.util.List;

import com.librarysys.model.Author;



public interface AuthorService {
	public abstract void  addAuthor(Author author);
	public abstract Author fetchAuthor(int author_Id);
	public abstract Integer deleteAuthor(int author_Id);
	public abstract Author updateClassificationById(int author_Id, Author author);
	public abstract List<Author>getAllAuthor();
}
