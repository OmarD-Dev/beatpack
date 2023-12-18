package com.pluralsight.beatpack;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("fire")
public class BeatDAOImpl implements BeatDAO {
    @Override
    public Beat getBeat() {
        return new Beat(3.30, "The Warmup");
    }
}
