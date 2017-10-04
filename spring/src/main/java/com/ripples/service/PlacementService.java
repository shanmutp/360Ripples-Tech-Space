package com.ripples.service;

import com.ripples.bo.impl.PlacementBo;
import com.ripples.domain.PlacementVo;

public class PlacementService 
{
	private PlacementVo o = null;
	private PlacementBo bo = null;
	
	public PlacementVo getO() 
	{
		return o;
	}

	public void setO(PlacementVo o) {
		this.o = o;
	}
	

	public PlacementBo getBo() {
		return bo;
	}

	public void setBo(PlacementBo bo) {
		this.bo = bo;
	}

	public void isResult()
	{
		
		if(o.getDegreeType().equalsIgnoreCase("b.e"))
		{
			bo.bonusForEngineers(o);
		}
		else
		{
			bo.bonusForOthers(o);
		}
	}
}
