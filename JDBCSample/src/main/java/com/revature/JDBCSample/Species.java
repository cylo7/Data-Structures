package com.revature.JDBCSample;

import java.io.Serializable;

/**
 * 
 * Species entity
 * 
 * The natural order of the Speciies is the id
 *
 */
public class Species implements Comparable<Species>, Serializable {
/**
 * 
 * Java 2.x compatibility
 */
	
	private long id;
	private String name;
	private long populationMillion;
	public Species(long id, String name, long populationMillion) {
		super();
		this.id = id;
		this.name = name;
		this.populationMillion = populationMillion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulationMillion() {
		return populationMillion;
	}
	public void setPopulationMillion(long populationMillion) {
		this.populationMillion = populationMillion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (populationMillion ^ (populationMillion >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Species other = (Species) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (populationMillion != other.populationMillion)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Species [id=" + id + ", name=" + name + ", populationMillion=" + populationMillion + "]";
	}
	
	
	
}
