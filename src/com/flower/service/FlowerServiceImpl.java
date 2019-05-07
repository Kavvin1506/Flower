package com.flower.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flower.dao.FlowerDAO;
import com.flower.model.Flower;

@Service("flowerservice")
public class FlowerServiceImpl implements FlowerService {
	@Autowired
	private FlowerDAO flowerDAO;

	@Transactional
	@Override
	public String doRegister(Flower flower) {
		return flowerDAO.doRegister(flower);
	}


	
	
	
}
