package com.bengreenier.assignment1.regions;

public class Country extends ContainerRegion {

	protected String leaderName;
	
	/**
	 * Constructor
	 * @param name
	 * @param leaderName
	 */
	public Country(String name,String leaderName) {
		super(name);
		this.leaderName = leaderName;
	}

	/**
	 * @return the leaderName
	 */
	public String getLeaderName() {
		return leaderName;
	}

	/**
	 * @param leaderName the leaderName to set
	 */
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	
	@Override
	public String toString() {
		String t = "Country: {\n" +
				"\t Name: "+getName() +
				"\n\t Population: "+getPopulation()+
				"\n\t Area: "+getArea()+
				"\n\t Leader Name: "+getLeaderName()+"\n}";
		return t;
	}

}
