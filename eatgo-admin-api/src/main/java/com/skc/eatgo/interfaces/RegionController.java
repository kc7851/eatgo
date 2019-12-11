package com.skc.eatgo.interfaces;

import com.skc.eatgo.application.RegionService;
import com.skc.eatgo.domain.Region;
import com.sun.media.sound.DLSInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<Region> list() {
        List<Region> regions = regionService.getRegions();

        return regions;
    }

}
