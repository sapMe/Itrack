package com.saps.product.itrack.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Track {
	
	 @Id
	 @NotNull
	 @Column(name = "track_id", nullable = false, updatable = false)
	private Long id;
	 
	 @NotNull
	 @Column(name = "item", nullable = false)
	private String item;
	 
	 @NotNull
	 @Column(name = "edate", nullable = false)
	private Date date;
	 
	 @NotNull
	 @Column(name = "cost", nullable = false)
	private Long cost;
	 

	 @Column(name = "note")
	private String note;
	
	 public Track(){
		 
	 }
	 
	 public Track(final Long id,final String item, final Long cost, final Date date,final String note){
		 this.id = id;
		 this.item = item;
		 this.cost = cost;
		 this.date = date;
		 this.note = note;
	 }
	 
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString(){
		return "id= "+id+", item="+item+", cost="+cost+" ,date="+date;
	}
	

}
