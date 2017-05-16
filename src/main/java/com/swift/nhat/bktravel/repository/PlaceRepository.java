package com.swift.nhat.bktravel.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.swift.nhat.bktravel.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer>{
	Place findById(int id);
}
