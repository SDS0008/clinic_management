package com.example.Clinical.Repository_interf;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Clinical.Data_On.Data_Entity;

@Repository
public interface Design_interface {

	Data_Entity  Save(Data_Entity data_entity);

	List<Data_Entity> getall();
}
