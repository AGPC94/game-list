package com.example.gamelistpibien.model;


import com.example.gamelistpibien.model.enums.Status;
import com.example.gamelistpibien.model.enums.Tag;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Game extends com.example.gamelistpibien.model.Base {
    int nFavs;
    boolean isFav;
    double averageScore;
    double score;
    Date releaseDate;
    Platform platform;
    Company developer;
    Company publisher;
    List<Game> saga;
    List<Tag> tags;
    Status status;

}
