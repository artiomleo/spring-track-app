package com.track.controller;

import com.track.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @RequestMapping(method = RequestMethod.POST)
    public Position save(@RequestBody Position position) {
        if (position.getId() != null) {
            throw new IllegalArgumentException("Invalid 'id' value. It should be empty");
        }

        return positionService.savePosition(position);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Position get(@RequestBody Position position) {
        if (position.getId() != null) {
            throw new IllegalArgumentException("Invalid 'id' value. It should be empty");
        }

        return positionService.savePosition(position);
    }
}
