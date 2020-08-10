package com.kveola13.repository;

import com.kveola13.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
