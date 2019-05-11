package com.librarysys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.librarysys.dao.AuthorDao;
import com.librarysys.model.Author;

public class AuthorDaoImpl implements AuthorDao {
	
	//dependancy injection
			private  DataSource dataSource;
			
			public void setDataSource( DataSource dataSource) {
				this.dataSource = dataSource;
			}
			
		@Override
		public void createAuthor(Author author) {
			Connection connection = null;
			PreparedStatement ps = null;
			
			try {
				connection=dataSource.getConnection();
				String SQL="INSERT INTO author(author_id,author_name) VALUES(?,?)";
				ps=connection.prepareStatement(SQL);
			

				ps.setInt(1, author.getAuthor_Id());
				ps.setString(2, author.getAuthor_name());
				int executeUpdate =ps.executeUpdate();
				
				if(executeUpdate>0) {
					System.out.println("Author is created");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(connection!=null) {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}	
			
		}

	

	@Override
	public void updateAuthorById(String newauthor_name, int author_Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Author> getAllAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author fetchAuthorById(int author_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteAuthorById(int author_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
