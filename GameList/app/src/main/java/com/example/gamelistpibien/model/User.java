package com.example.gamelistpibien.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {
    //Info
    String nick;
    String email;
    String password;
    String biography;
    String profile;
    boolean isPrivate;
    //Other
    List<Notification> notifications;
    //Social
    List<User> followers;
    List<User> following;
    List<User> blocks;
    //List
    List<Game> gameList;
    List<Activity> wall;
    List<Game> favGames;

    public User(String nick, String email, String password) {
        this.nick = nick;
        this.email = email;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<User> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<User> blocks) {
        this.blocks = blocks;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public List<Activity> getWall() {
        return wall;
    }

    public void setWall(List<Activity> wall) {
        this.wall = wall;
    }

    public List<Game> getFavGames() {
        return favGames;
    }

    public void setFavGames(List<Game> favGames) {
        this.favGames = favGames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
