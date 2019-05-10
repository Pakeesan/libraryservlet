package com.library.dao;

import java.util.List;

import com.library.model.Auther;

public interface AutherDAO {
	public abstract Auther createAuther(Auther auther);
	public abstract Auther getAutherById(int AutherId);
	public abstract Integer deleteAutherById(int AutherId);
	public abstract Auther updateAutherById(int AutherId,Auther auther);
	public abstract List<AutherDAO> getAllAutherDetails();
}
