package com.example.Clinical.Repository_interf;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.Clinical.Data_On.Data_Entity;

@Service
public class Service_impl implements Design_interface {

	
	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	Data_Entity data_entity;
	

	
	//using this we can create table in data bases...
	 //create table clinic_data(name varchar2(50),email varchar2(200),doctor varchar2(50),address varchar2(50),contact varchar2(50),fle clob,image clob);
	
	
	
	
	@Override
	public Data_Entity Save(Data_Entity data_entity) {
		// TODO Auto-generated method stub
		
		String INSERT_USER_DATA ="insert into clinic_data values(?,?,?,?,?,?,?)";
		
		jdbc.update(INSERT_USER_DATA,data_entity.getName(),data_entity.getEmail(),data_entity.getDoctor(),data_entity.getAddress(),data_entity.getContact(),data_entity.getFle(),data_entity.getImage());
		
		
		data_entity.getName();
		data_entity.getEmail();
		data_entity.getDoctor();
		data_entity.getAddress();		
		data_entity.getContact();
	    data_entity.getFle();
		data_entity.getImage();
		
		
		
		System.out.println(data_entity.getName());
		System.out.println(data_entity.getEmail());
		System.out.println(	data_entity.getDoctor());
		System.out.println(data_entity.getAddress());
		System.out.println(data_entity.getContact());
		System.out.println(data_entity.getFle());
		System.out.println(	data_entity.getImage());
		System.out.println("All details are here...");

		
		System.out.println(data_entity.getClass());
		
		return data_entity;
	}


	@Override
	public List<Data_Entity> getall() {
		// TODO Auto-generated method stub
		
String GET_USERS_DATA ="select * from clinic_data";
		
		return jdbc.query(GET_USERS_DATA,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
			Data_Entity data = new Data_Entity();
			
			data.setName(rs.getString("name"));
			data.setEmail(rs.getString("email"));
			data.setDoctor(rs.getString("doctor"));
			data.setAddress(rs.getString("address"));
			data.setContact(rs.getString("contact"));
			data.setFle(rs.getString("fle"));
			
			data.setImage(rs.getString("image"));
			
				return data;
			}
		} );
	

	
		
		
	}

}
