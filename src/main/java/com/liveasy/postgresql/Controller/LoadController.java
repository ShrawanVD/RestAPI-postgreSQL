package com.liveasy.postgresql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.postgresql.Entity.LoadEntity;
import com.liveasy.postgresql.Service.LoadService;

@RestController
@RequestMapping("/load")
public class LoadController {
	
	 @Autowired
	 private LoadService loadService;

	    
	    @PostMapping
	    public ResponseEntity<String> addLoad(@RequestBody LoadEntity loadEntity) {
	        LoadEntity addedLoad = loadService.addLoadEntity(loadEntity);
	        if (addedLoad != null) {
	            return ResponseEntity.ok("Load details added successfully");
	        } else {
	            return ResponseEntity.badRequest().build();
	        }
	    }

	    @GetMapping
	    public ResponseEntity<List<LoadEntity>> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
	        List<LoadEntity> loads = loadService.getAllLoadEntitysByShipperId(shipperId);
	        return ResponseEntity.ok(loads);
	    }

	    @GetMapping("/{loadId}")
	    public ResponseEntity<LoadEntity> getLoadById(@PathVariable Long loadId) {
	        LoadEntity load = loadService.getLoadEntityById(loadId);
	        if (load != null) {
	            return ResponseEntity.ok(load);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PutMapping("/{loadId}")
	    public ResponseEntity<LoadEntity> updateLoad(@PathVariable Long loadId, @RequestBody LoadEntity updatedLoadEntity) {
	        LoadEntity updatedLoad = loadService.updateLoadEntity(loadId, updatedLoadEntity);
	        if (updatedLoad != null) {
	            return ResponseEntity.ok(updatedLoad);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{loadId}")
	    public ResponseEntity<String> deleteLoad(@PathVariable Long loadId) {
	        loadService.deleteLoadEntity(loadId);
	        return ResponseEntity.ok("Load deleted successfully");
	    }

}
