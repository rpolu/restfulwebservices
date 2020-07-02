package com.uinversity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uinversity.dao.UniversityDao;
import com.uinversity.model.UniversityModel;
import com.uinversity.service.UniversityService;

@Service
public class UinversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityDao universityDao;

	@Override
	public void saveUinversity(UniversityModel universityModel) {
		universityDao.saveUinversity(universityModel);
	}

	@Override
	public void deleteUinversity(String name) {
		universityDao.deleteUinversity(name);

	}

	@Override
	public void updateUinversity(UniversityModel universityModel) {
		universityDao.updateUinversity(universityModel);

	}

	@Override
	public UniversityModel getUniversity(String name) {
		return universityDao.getUniversity(name);
	}

	@Override
	public List<UniversityModel> getUniversites() {

		return universityDao.getUniversites();
	}

}
