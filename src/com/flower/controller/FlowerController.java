package com.flower.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flower.model.Flower;
import com.flower.service.FlowerService;

@Controller
public class FlowerController{
	@Autowired
	private FlowerService flowerService;

@RequestMapping(value = "/start", method = RequestMethod.GET)
public String init() {
	return "flower";
}
@RequestMapping(value = "/register", method = RequestMethod.POST)
public String doRegister(Model model, @ModelAttribute("flowerBean") Flower flowerBean) {
	if (flowerBean != null && flowerBean.getFlowerName() != null && flowerBean.getColour() != null
			&& flowerBean.getType() != null && flowerBean.getCost() != 0) {
		model.addAttribute("msg", "Registered Successfully");
		return flowerService.doRegister(flowerBean);
	} else {
		model.addAttribute("error", "Error Occured");
		return "error";
	}
}

}
