package com.uinversity.dao;

import java.util.List;

import com.uinversity.model.UniversityModel;

public interface UniversityDao {

	public void saveUinversity(UniversityModel universityModel);

	public void deleteUinversity(String name);

	public void updateUinversity(UniversityModel universityModel);
	
	public UniversityModel getUniversity(String name);
	
	public List<UniversityModel> getUniversites(String name);

}
