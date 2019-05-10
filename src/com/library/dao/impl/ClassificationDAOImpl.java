package com.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.library.dao.ClassificationDAO;
import com.library.model.Classification;

public class ClassificationDAOImpl implements ClassificationDAO{
	
	private DataSource datasource;
	

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Classification createClassification(Classification classification) {
		Connection connection =null;
		PreparedStatement ps=null;
		
		try {
			connection=datasource.getConnection();
			String SQL="INSERT INTO classification (classificatin_id,classificatinname) VALUES (?,?)";
			ps=connection.prepareStatement(SQL);
			ps.setInt(1, classification.getClassificationId());
			ps.setString(2, classification.getClassificationName());
			
			int executeUpdate=ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("created");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public Classification getClassificationById(int classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteClassificationById(int classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification updateClassificationById(int classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classification> getAllClassificationDetails() {
		Connection connection =null;
		PreparedStatement ps=null;
		List<Classification> classificationList=new ArrayList<Classification>();
		
		try {
			connection=datasource.getConnection();
			String SQL="SELECT classificatin_id,classificatinname FROM classification";
			ps=connection.prepareStatement(SQL);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				Classification classification=new Classification();
				classification.setClassificationId(rs.getInt("classificatin_id"));
				classification.setClassificationName(rs.getString("classificatinname"));
				classificationList.add(classification);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return classificationList;
	}
	

	
}
