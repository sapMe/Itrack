package com.saps.product.itrack.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saps.product.itrack.domain.Track;
import com.saps.product.itrack.service.TrackService;

@RestController
@RequestMapping(value = "/track")
public class TrackController {
	
	@Autowired
	private TrackService trackService;
	
	@RequestMapping(value= "/add", method = RequestMethod.GET)
	public Track addTrack(@PathVariable String item, @PathVariable long cost,
			@PathVariable Date date, @PathVariable String note){
		Track track = new Track();
		track.setItem(item);
		track.setCost(cost);
		track.setDate(date);
		track.setNote(note);
		
		return track;
	}
	
	@RequestMapping("/delete/{id}")
	public void deletedItem(@PathVariable Long id ){
		Track track= new Track();
		track.setId(id);
		trackService.delete(id);
	}
	
	@RequestMapping("/")
	public List<Track> getTracks(){
		return trackService.findAll();
	}
	
	@RequestMapping(value = "/{id}")
	public Track getTrack(@PathVariable Long id){
		Track track = trackService.findOne(id);
		return track;
	}
	
	
	
	}
