package com.ripples.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ripples.domain.PlacementVo;
import com.ripples.service.PlacementService;

public class PlacementSystemPojo 
{

	public static boolean result ;
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Placement.xml");
		PlacementService e = (PlacementService) context.getBean("PlaceServiceBeam");
		PlacementVo vo = (PlacementVo) context.getBean("PlacementSetAttributes");
		e.isResult();
		if(result)
			System.out.println(vo.getCandidateName()+" got placed");
		else
			System.out.println(vo.getCandidateName()+" not placed");
	} 
}
