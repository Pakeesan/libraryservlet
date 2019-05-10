package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.model.Classification;
import com.library.service.ClassificationService;
import com.library.service.impl.ClassificationServiceImpl;

public class Text {
	public static void main(String args[]) {
		//System.out.println("hiii");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Classificationconfig.xml");
		
		ClassificationService classificationService=context.getBean("classificationService",ClassificationServiceImpl.class);
		
//		Classification classification=new Classification();
//		
//		classification.setClassificationId(1);
//		classification.setClassificationName("maths");
//		
// 		classificationService.addclassification(classification);
		
		for(Classification classification:classificationService.getAllClassificationDetails()) {
			System.out.println(classification.getClassificationId()+"   "+classification.getClassificationName());
		}
		
	}
}
