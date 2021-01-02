package com.elegant.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.elegant.model.OrangeBusModel;

@Service
public class OrangeBusService {

	private static Map<Integer, OrangeBusModel> map = new HashMap<Integer, OrangeBusModel>();

	static {
		OrangeBusModel b1 = new OrangeBusModel(1, "bang", "kadapa", 50);
		OrangeBusModel b2 = new OrangeBusModel(2, "hyd", "kadapa", 30);
		map.put(1, b1);
		map.put(2, b2);
	}

	public List<OrangeBusModel> getAllBus() {
		List<OrangeBusModel> valueList = new ArrayList<OrangeBusModel>(map.values());
		return valueList;
	}

	public void saveBus(OrangeBusModel orangeBusModel) {
		map.put(orangeBusModel.getServiceNum(), orangeBusModel);
	}

	public OrangeBusModel getBus(int serviceNum) {
		return map.get(serviceNum);
	}

	public void deleteBus(int serviceNum) {
		map.remove(serviceNum);
	}

}
