package com.example.Clinical.Controller;

import java.security.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Clinical.Data_On.Data_Entity;
import com.example.Clinical.Repository_interf.Service_impl;

@RestController
public class Contro_lller {

	@Autowired
	Service_impl Servi;
	
	@Autowired
	Data_Entity data_ent;
	
	
	
	
	@RequestMapping("/Save")
	public Data_Entity Save_method(@RequestParam String name,@RequestParam String email,@RequestParam String doctor,  @RequestParam String address,@RequestParam String contact, @RequestParam String fle, @RequestParam String image) {
		
	
		data_ent.setName(name);
		data_ent.setEmail(email);
		data_ent.setDoctor(doctor);
		data_ent.setAddress(address);
		data_ent.setContact(contact);
		data_ent.setFle(fle);
	data_ent.setImage(image);
		
		
		Servi.Save(data_ent);
		return data_ent;
	}
	
	
	@RequestMapping("/get")
	public List<Data_Entity> getuser(){
		
		
		
		
	System.out.println(	data_ent.getName());
		
		return Servi.getall();
		
	}
	
}
