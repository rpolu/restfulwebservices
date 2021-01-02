package com.elegant.model;

public class OrangeBusModel {
	private int serviceNum;
	private String from;
	private String to;
	private int numTickets;

	public OrangeBusModel(int serviceNum, String from, String to, int numTickets) {
		super();
		this.serviceNum = serviceNum;
		this.from = from;
		this.to = to;
		this.numTickets = numTickets;
	}

	public OrangeBusModel() {

	}

	public int getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(int serviceNum) {
		this.serviceNum = serviceNum;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getNumTickets() {
		return numTickets;
	}

	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}

}
