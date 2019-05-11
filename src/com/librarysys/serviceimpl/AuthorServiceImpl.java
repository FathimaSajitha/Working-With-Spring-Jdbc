package com.librarysys.serviceimpl;

import java.util.List;

import com.librarysys.dao.AuthorDao;
import com.librarysys.model.Author;
import com.librarysys.service.AuthorService;

public class AuthorServiceImpl implements AuthorService{
	
	
	private AuthorDao authorDao;
	
	public AuthorDao getAuthorDao() {
		return authorDao;
	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Override
	public void addAuthor(Author author) {
		authorDao.createAuthor(author);
	}

	@Override
	public Author fetchAuthor(int author_Id) {
		return authorDao.fetchAuthorById(author_Id) ;
	}

	@Override
	public Integer deleteAuthor(int author_Id) {
		return authorDao.deleteAuthorById(author_Id);
	}

	@Override
	public Author updateClassificationById(int author_Id, Author author) {
		return null;
	}

	@Override
	public List<Author> getAllAuthor() {
		return authorDao.getAllAuthor();
	}

}
