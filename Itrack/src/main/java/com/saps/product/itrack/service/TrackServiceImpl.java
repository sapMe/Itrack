package com.saps.product.itrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saps.product.itrack.domain.Track;
import com.saps.product.itrack.repository.TrackRepository;

@Service
@Transactional
public class TrackServiceImpl implements TrackService{
	
	 @Autowired
	 private TrackRepository trackRepository;

	@Override
	public List<Track> findAll() {
		return trackRepository.findAll();
	}

	@Override
	public void saveTrackItem(Track track) {
		trackRepository.save(track);
		
	}

	@Override
	public Track findOne(long id) {
		return 	trackRepository.findOne(id);
		
	}

	@Override
	public void delete(long id) {
		trackRepository.delete(id);
		
	}

	

	

}
