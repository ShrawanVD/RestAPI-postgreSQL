package com.liveasy.postgresql.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.liveasy.postgresql.Entity.LoadEntity;

@Repository
public interface LoadRepository extends JpaRepository<LoadEntity, Long> {
	
	List<LoadEntity> findByShipperId(String shipperId);

}
