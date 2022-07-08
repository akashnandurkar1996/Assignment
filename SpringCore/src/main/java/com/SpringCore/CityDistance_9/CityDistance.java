package com.SpringCore.CityDistance_9;

public class CityDistance {

	private String fromcity;
	private String tocity;
	private double distance;

	public String getFromcity() {
		return fromcity;
	}

	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}

	public String getTocity() {
		return tocity;
	}

	public void setTocity(String tocity) {
		this.tocity = tocity;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	


	@Override
	public String toString() {
		return "CityDistance [fromcity=" + fromcity + ", tocity=" + tocity + ", distance=" + distance + "]";
	}

}
