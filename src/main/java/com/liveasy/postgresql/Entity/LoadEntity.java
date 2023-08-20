package com.liveasy.postgresql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LoadData")
public class LoadEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "srNo")
    private Long id;
	
	@Column(name = "loadingPoint")
    private String loadingPoint;
	
	@Column(name = "unloadingPoint")
    private String unloadingPoint;
	
	@Column(name = "productType")
    private String productType;
	
	@Column(name = "truckType")
    private String truckType;
	
	@Column(name = "noOfTrucks")
    private String noOfTrucks;
	
	@Column(name = "weight")
    private String weight;
	
	@Column(name = "comment")
    private String comment;
	
	@Column(name = "date")
    private String date;
	
	@Column(name = "shipperID")
	private String shipperId;
	
	
	
	public Long getId() {
		return id;
	}
	
	public LoadEntity() {
		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
    
    


}
