package com.app.reportx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.reportx.model.Items;

//import antlr.collections.List;

public interface ItemsRepository extends JpaRepository<Items, Integer>{
//	@Query(value="Select * from items where itemname=?1",nativeQuery = true)
	List<Items> findByName(String itemName);
	
	@Query(value="Select * from items where DATEDIFF(expdate, now()) <30",nativeQuery = true)
	List<Items> findByexpdate();
	
	@Query(value="Select * from items where manfdate=?1",nativeQuery = true)
	List<Items> findBymanfdate(String manfdate);
	
	@Query(value="Select * from items where expdate=?1",nativeQuery = true)
	List<Items> findByexpdate(String expdate);
	
	@Query(value="Select * from items where itemdesc=?1",nativeQuery = true)
	List<Items> findBydesc(String itemdesc);
	
}
