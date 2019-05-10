package com.library.dao;
import java.util.List;

import com.library.model.Classification;



public interface ClassificationDAO {
	public abstract Classification createClassification(Classification classification);
	public abstract Classification getClassificationById(int classificationId);
	public abstract Integer deleteClassificationById(int classificationId);
	public abstract Classification updateClassificationById(int classificationId,Classification classification);
	public abstract List<Classification> getAllClassificationDetails();


}



