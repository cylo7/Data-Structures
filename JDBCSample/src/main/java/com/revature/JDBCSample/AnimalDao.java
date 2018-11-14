package com.revature.JDBCSample;

import java.util.Set;

/**
 * 
 * DAO Data Access Object
 * Most used interfce driven development design pattern.
 * Multiple concrete classes for same behavior
 * DAO specifically focuses on basic CRUD operations.
 * CREATE - INSERT, READ - SELECT, UPDATE, DELETE)
 * -- No business logic "SINGLE RESPONSIBLITY PRINCIPLE"
 * (CREATE - INSERT, READ - SELECT, UPDATE, DELETE)
 * 
 * 
 * You need a SpeciesDao
 *
 */

public interface AnimalDao {
	boolean insert(Animal animal);
	
	/**
	 * 
	 * To demonstrate execution of Stored Procedure
	 * @param animal
	 * @return
	 */
	boolean insertProcedure(Animal animal);
	/**
	 * To demonstrate getting a single value from a ResultSet
	 * @param name
	 * @return
	 */
	Animal findByName(String name);
	/**
	 * 
	 * @return
	 */
	Set<Animal> findAll();
	/**
	 * 
	 */
	

}
