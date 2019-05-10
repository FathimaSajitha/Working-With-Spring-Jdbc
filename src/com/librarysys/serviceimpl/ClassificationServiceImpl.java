package com.librarysys.serviceimpl;

import java.util.List;

import com.librarysys.dao.ClassificationDao;
import com.librarysys.model.Classification;
import com.librarysys.service.ClassificationService;



public class ClassificationServiceImpl implements ClassificationService {
		
	private ClassificationDao classificationDao;

		public ClassificationDao getClassificationDao() {
			return classificationDao;
		}

		public void setClassificationDao(ClassificationDao classificationDao) {
			this.classificationDao = classificationDao;
		}

		@Override
		public void addClassification(Classification classification) {
			classificationDao.createClassification(classification);
			
		}

		@Override
		public Classification fetchClassification(int classifictionId) {
			return classificationDao.getClassificationById(classifictionId);
		}

		@Override
		public Integer deleteClassification(int classifictionId) {
			return classificationDao.deleteClassificationById(classifictionId);
		}

		@Override
		public Classification updateClassificationById(int classificationId,
				Classification classification) {
			return null;
		}

		@Override
		public List<Classification> getAllClassifications() {
			// TODO Auto-generated method stub
			return classificationDao.getAllClassifictionDetails();
		}

		

	
	
}
