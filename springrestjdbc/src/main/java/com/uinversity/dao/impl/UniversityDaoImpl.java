package com.uinversity.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uinversity.dao.UniversityDao;
import com.uinversity.model.UniversityModel;

@Repository
public class UniversityDaoImpl implements UniversityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveUinversity(UniversityModel universityModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUinversity(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUinversity(UniversityModel universityModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public UniversityModel getUniversity(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UniversityModel> getUniversites(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
