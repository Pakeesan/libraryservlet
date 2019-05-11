package com.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.library.dao.AutherDAO;
import com.library.model.Auther;

public class AutherDAOImpl implements AutherDAO{
	
	private DataSource datasource;
	
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public Auther createAuther(Auther auther) {
		Connection connection=null;
		PreparedStatement ps=null;
		
		try {
			connection=datasource.getConnection();
			String SQL="INSERT INTO auther(auther_id,auther_name) VALUE(?,?)";
			ps=connection.prepareStatement(SQL);
			ps.setInt(1, auther.getAutherId());
			ps.setString(2,auther.getAutherNmae());
			
			int executeUdate=ps.executeUpdate();
			if(executeUdate>0) {
				System.out.println("created");
			}
		}catch(Exception e) {
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
	public Auther getAutherById(int AutherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteAutherById(int AutherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auther updateAutherById(int AutherId, Auther auther) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AutherDAO> getAllAutherDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
