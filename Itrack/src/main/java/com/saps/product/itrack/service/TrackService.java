package com.saps.product.itrack.service;

import java.util.List;

import com.saps.product.itrack.domain.Track;

public interface TrackService {
	public List<Track> findAll();
	public void saveTrackItem(Track track);
	public Track findOne(long id);
	public void delete(long id);
	
	

}
