package com.htc.vaccinationdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface centerinterface extends  JpaRepository<centerinterface,Long> {
	
	@Query(value="SELECT centreid,centreaddress,pincode,scheduleddatetime FROM center WHERE pincode=?1",nativeQuery = true)
	public List<centerinterface> findByPincode(Long pin_code);

}


