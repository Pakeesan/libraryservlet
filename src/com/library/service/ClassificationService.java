package com.library.service;

import java.util.List;

import com.library.dao.ClassificationDAO;
import com.library.model.Classification;



public interface ClassificationService {
	public abstract Classification addclassification(Classification classification);
	public abstract Integer deleteClassificationById(int classificationId);
	public abstract Classification updateClassificationById(int classificationId,Classification classification);
	public abstract Classification fatchClassificationById(int classificationId);
	public abstract List<Classification> getAllClassificationDetails();

}


