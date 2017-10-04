package com.ripples.bo.impl;

import com.ripples.dao.impl.PlacementResultDao;
import com.ripples.domain.PlacementVo;

public class PlacementBo 
{
	private PlacementResultDao dao = null;
	
	public PlacementResultDao getDao() 
	{
		return dao;
	}
	public void setDao(PlacementResultDao dao) 
	{
		this.dao = dao;
	}
	public void bonusForEngineers(PlacementVo o)
	{
		o.setMarks(o.getMarks()+20);
		dao.resultValidation(o);
	}
	public void bonusForOthers(PlacementVo o)
	{
		o.setMarks(o.getMarks()+10);
		dao.resultValidation(o);
	}

}
