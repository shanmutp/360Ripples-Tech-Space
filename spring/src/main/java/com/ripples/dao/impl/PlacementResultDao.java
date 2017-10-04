package com.ripples.dao.impl;

import com.ripples.domain.PlacementVo;
import com.ripples.spring.boot.PlacementSystemPojo;

public class PlacementResultDao 
{
	public void resultValidation(PlacementVo o)
	{
		if(o.getMarks() >= 50)
			PlacementSystemPojo.result = true;
		else
			PlacementSystemPojo.result = false; 
	}

	
}
