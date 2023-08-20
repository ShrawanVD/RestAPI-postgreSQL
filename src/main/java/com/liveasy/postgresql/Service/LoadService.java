package com.liveasy.postgresql.Service;

import java.util.List;

import com.liveasy.postgresql.Entity.LoadEntity;

public interface LoadService {
	
	LoadEntity addLoadEntity(LoadEntity LoadEntity);
    List<LoadEntity> getAllLoadEntitysByShipperId(String shipperId);
    LoadEntity getLoadEntityById(Long LoadEntityId);
    LoadEntity updateLoadEntity(Long LoadEntityId, LoadEntity updatedLoadEntity);
    void deleteLoadEntity(Long LoadEntityId);
    
}
