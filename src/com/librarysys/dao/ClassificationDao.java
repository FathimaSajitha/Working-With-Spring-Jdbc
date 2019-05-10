package com.librarysys.dao;

import java.util.List;

import com.librarysys.model.Classification;

public interface ClassificationDao {
	
	public abstract void createClassification(Classification classification);
	public abstract Classification getClassificationById(int classifictionId);
	public abstract Integer deleteClassificationById(int classifictionId);
	public abstract void updateClassificationById(String newclassificationName,int classificationId);
	public abstract List<Classification>getAllClassifictionDetails(); 
}
