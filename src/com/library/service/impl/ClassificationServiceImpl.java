package com.library.service.impl;

import java.util.List;

import com.library.dao.ClassificationDAO;
import com.library.model.Classification;
import com.library.service.ClassificationService;

public class ClassificationServiceImpl implements ClassificationService{
	
	private ClassificationDAO classificationDAO;

	public ClassificationDAO getClassificationDAO() {
		return classificationDAO;
	}

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	public Classification addclassification(Classification classification) {
		// TODO Auto-generated method stub
		return classificationDAO.createClassification(classification);
	}

	@Override
	public Integer deleteClassificationById(int classificationId) {
		// TODO Auto-generated method stub
		return classificationDAO.deleteClassificationById(classificationId);
	}

	@Override
	public Classification updateClassificationById(int classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return classificationDAO.updateClassificationById(classificationId, classification);
	}

	@Override
	public Classification fatchClassificationById(int classificationId) {
		// TODO Auto-generated method stub
		return classificationDAO.getClassificationById(classificationId);
	}

	@Override
	public List<Classification> getAllClassificationDetails() {
		// TODO Auto-generated method stub
		return classificationDAO.getAllClassificationDetails();
	}

	

}
