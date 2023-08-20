package com.liveasy.postgresql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.postgresql.Entity.LoadEntity;
import com.liveasy.postgresql.Repository.LoadRepository;

@Service
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	private LoadRepository loadRepository;

	@Override
	public LoadEntity addLoadEntity(LoadEntity loadEntity) {
		return loadRepository.save(loadEntity);
	}

	@Override
	public List<LoadEntity> getAllLoadEntitysByShipperId(String shipperId) {
		return loadRepository.findByShipperId(shipperId);
	}
	
	@Override
	public LoadEntity updateLoadEntity(Long loadEntityId, LoadEntity updatedLoadEntity) {
		Optional<LoadEntity> optionalExistingLoadEntity = loadRepository.findById(loadEntityId);
	    if (optionalExistingLoadEntity.isPresent()) {
	        LoadEntity existingLoadEntity = optionalExistingLoadEntity.get();
	        
	        existingLoadEntity.setLoadingPoint(updatedLoadEntity.getLoadingPoint());
	        existingLoadEntity.setUnloadingPoint(updatedLoadEntity.getUnloadingPoint());
	        existingLoadEntity.setProductType(updatedLoadEntity.getProductType());
	        existingLoadEntity.setTruckType(updatedLoadEntity.getTruckType());
	        existingLoadEntity.setNoOfTrucks(updatedLoadEntity.getNoOfTrucks());
	        existingLoadEntity.setWeight(updatedLoadEntity.getWeight());
	        existingLoadEntity.setComment(updatedLoadEntity.getComment());
	        existingLoadEntity.setDate(updatedLoadEntity.getDate());

	        return loadRepository.save(existingLoadEntity);
	    }
	    return null;
	}

	@Override
	public LoadEntity getLoadEntityById(Long loadEntityId) {
		Optional<LoadEntity> data = loadRepository.findById(loadEntityId);
		LoadEntity entity = null;
		if(data.isPresent()){
			entity = data.get();
		}
		return entity;
	}


	@Override
	public void deleteLoadEntity(Long loadEntityId) {
		loadRepository.deleteById(loadEntityId);
	}

}
