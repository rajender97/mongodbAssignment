package com.stackroute.Muzix.SeedData;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerData implements CommandLineRunner {
    @Autowired
    TrackService trackService;

    public void setTrackService(TrackService trackService) {
        this.trackService = trackService;
    }

    @Override
    public void run(String... args) throws Exception {
        Track track=new Track();
        track.setTrackId(2);
        track.setTrackName("bahubali");
        track.setComments("good");
        trackService.saveTrack(track);
    }
}


