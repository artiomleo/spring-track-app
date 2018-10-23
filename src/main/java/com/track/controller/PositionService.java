package com.track.controller;

import com.track.model.Position;
import com.track.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public Position savePosition(Position position) {
        return positionRepository.save(position);
    }
}