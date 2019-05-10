package com.librarysys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import com.librarysys.dao.ClassificationDao;
import com.librarysys.model.Classification;

public class ClassificationDaoImpl implements ClassificationDao {
	//dependancy
		private  DataSource dataSource;
		
		public void setDataSource( DataSource dataSource) {
			this.dataSource = dataSource;
		}
		
		@Override
		public void createClassification(Classification classification) {
			Connection connection = null;
			PreparedStatement ps = null;
			
			try {
				connection=dataSource.getConnection();
				String SQL="INSERT INTO classification(classification_id,classification_name) VALUES(?,?)";
				ps=connection.prepareStatement(SQL);
			

				ps.setInt(1, classification.getClassificationId());
				ps.setString(2, classification.getClassificationName());
				int executeUpdate =ps.executeUpdate();
				
				if(executeUpdate>0) {
					System.out.println("classification is created");
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
		public Classification getClassificationById(int classifictionId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Integer deleteClassificationById(int classifictionId) {
			return null;
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateClassificationById(String newclassificationName, int classificationId) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<Classification> getAllClassifictionDetails() {
			Connection connection = null;
			PreparedStatement ps = null;
			List<Classification> classificationList = new ArrayList <Classification>();
			
			try {
				connection=dataSource.getConnection();
				String SQL="SELECT classification.classification_id,classification.classification_name FROM classification ";
				ps=connection.prepareStatement(SQL);
			
				ResultSet rs=ps.executeQuery();
				
				
				while(rs.next()) {
					Classification classification = new Classification();
					classification.setClassificationId(rs.getInt("classification_id"));
					classification.setClassificationName(rs.getString("classification_name"));
					classificationList.add(classification);
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			
			}
			return classificationList;

	
}
		}
