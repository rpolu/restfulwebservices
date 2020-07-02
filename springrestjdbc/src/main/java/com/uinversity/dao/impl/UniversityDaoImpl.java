package com.uinversity.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.uinversity.dao.UniversityDao;
import com.uinversity.model.UniversityModel;

@Repository
public class UniversityDaoImpl implements UniversityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String INSERT_UINVERSITY = "INSERT INTO UNIVERSITY VALUES (?,?,?,?,?) ";
	private String UPDATE_UINVERSITY = "UPDATE UNIVERSITY  SET NODEPT = NODEPT+ ? ,NOCOLLEGES = NOCOLLEGES + ? WHERE NAME =  ? ";
	private String DELETE_UINVERSITY = "DELETE FROM UNIVERSITY WHERE NAME =  ? ";
	private String GET_ALL_UINVERSITY = "SELECT *  FROM UNIVERSITY ";
	private String GET_UINVERSITY = "SELECT *  FROM UNIVERSITY  WHERE NAME =  ? ";

	@Override
	public void saveUinversity(UniversityModel universityModel) {
		jdbcTemplate.update(INSERT_UINVERSITY, universityModel.getName(), universityModel.getAddress(),
				universityModel.getNoColleges(), universityModel.getNoDept(), universityModel.getZipCode());

	}

	@Override
	public void deleteUinversity(String name) {
		jdbcTemplate.update(DELETE_UINVERSITY, name);

	}

	@Override
	public void updateUinversity(UniversityModel universityModel) {
		jdbcTemplate.update(UPDATE_UINVERSITY, universityModel.getNoDept(), universityModel.getNoColleges(),
				universityModel.getName());

	}

	@Override
	public UniversityModel getUniversity(String name) {
		UniversityModel universityModel = new UniversityModel();
		SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(GET_UINVERSITY, name);
		if (sqlRowSet.next()) {
			universityModel.setName(sqlRowSet.getString(1));
			universityModel.setAddress(sqlRowSet.getString(2));
			universityModel.setNoColleges(sqlRowSet.getInt(3));
			universityModel.setNoDept(sqlRowSet.getInt(4));
			universityModel.setZipCode(sqlRowSet.getInt(5));
		}

		return universityModel;
	}

	@Override
	public List<UniversityModel> getUniversites() {
		ArrayList<UniversityModel> universityModels = new ArrayList<UniversityModel>();

		SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(GET_ALL_UINVERSITY);
		while (sqlRowSet.next()) {
			UniversityModel universityModel = new UniversityModel();
			universityModel.setName(sqlRowSet.getString(1));
			universityModel.setAddress(sqlRowSet.getString(2));
			universityModel.setNoColleges(sqlRowSet.getInt(3));
			universityModel.setNoDept(sqlRowSet.getInt(4));
			universityModel.setZipCode(sqlRowSet.getInt(5));
			universityModels.add(universityModel);
		}

		return universityModels;
	}

}
