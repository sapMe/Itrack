package com.saps.product.itrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saps.product.itrack.domain.Track;


public interface TrackRepository extends JpaRepository<Track, Long>{

}
