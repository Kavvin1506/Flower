package com.flower.dao;
import com.flower.model.Flower;
import java.util.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("flowerDAO")
public class FlowerDAOImpl implements FlowerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String doRegister(Flower flower) {
		sessionFactory.getCurrentSession().save(flower);
		return "flower";
	}

}
