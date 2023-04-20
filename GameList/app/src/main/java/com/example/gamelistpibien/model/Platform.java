package com.example.gamelistpibien.model;

import com.example.gamelistpibien.model.enums.PlatformType;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Platform extends Base {
    Date releaseDate;
    List<Game> games;
    PlatformType type;
    List<Company> companies;

}