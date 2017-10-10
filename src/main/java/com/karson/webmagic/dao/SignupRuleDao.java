package com.karson.webmagic.dao;

 
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
 
public interface SignupRuleDao extends MongoRepository<SignupRule, String> {
 
	@Query(value="{$or:[{\"carrier\":{\"$regex\":?0}},{\"identity\":{\"$regex\":?0}},{\"id\":?0}]}")	
	public Page<SignupRule> findBypageAndQuery(String ss , Pageable pageable);
	
	@Query(value="{\"carrier\":{\"$regex\":?0}}")	
	public List<SignupRule> findByCarrier(@Param("carrier") String ss); 
}