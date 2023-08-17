package com.yourname;
public class Player {
    private Team team;
    private double height;
    private double speed;
    private double accuracy;
    private boolean isScholar;
    private double GPA;

    public Player(Team team, double height, double speed, double accuracy) {
        this.team = team;
        this.height = height;
        this.speed = speed;
        this.accuracy = accuracy;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public double getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public boolean isScholar() {
        return isScholar;
    }

    public double getGPA() {
        return GPA;
    }

    // Other methods related to the Player class
}