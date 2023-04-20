package com.example.gamelistpibien.model;


import com.example.gamelistpibien.model.enums.CompanyType;

import java.util.List;

public class Company extends Base{
    List<Game> games;
    List<Platform> platforms;
    CompanyType type;
}
