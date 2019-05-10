package com.librarysys.service;

import java.util.List;

import com.librarysys.model.Classification;

public interface ClassificationService {
	
	public abstract void  addClassification(Classification classification);
	public abstract Classification fetchClassification(int classifictionId);
	public abstract Integer deleteClassification(int classifictionId);
	public abstract Classification updateClassificationById(int classificationId, Classification classification);
	public abstract List<Classification>getAllClassifications();

}