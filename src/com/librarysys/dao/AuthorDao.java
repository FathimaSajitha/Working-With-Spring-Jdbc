package com.librarysys.dao;

import java.util.List;

import com.librarysys.model.Author;


public interface AuthorDao {
	public abstract void  createAuthor(Author author);
	public abstract Author fetchAuthorById(int author_Id);
	public abstract Integer deleteAuthorById(int author_Id);
	public abstract void updateAuthorById(String newauthor_name ,int author_Id);
	public abstract List<Author>getAllAuthor();
}
