package com.kveola13.service;

import com.kveola13.model.Speaker;
import com.kveola13.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("Speaker service impl no argument constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("Speaker service impl repository constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("After constructors");
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Speaker service impl setter");
        this.repository = repository;
    }
}
