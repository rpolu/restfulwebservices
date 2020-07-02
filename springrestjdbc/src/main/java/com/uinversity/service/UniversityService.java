package com.uinversity.service;

import java.util.List;

import com.uinversity.model.UniversityModel;

public interface UniversityService {
	public void saveUinversity(UniversityModel universityModel);

	public void deleteUinversity(String name);

	public void updateUinversity(UniversityModel universityModel);

	public UniversityModel getUniversity(String name);

	public List<UniversityModel> getUniversites();
}
