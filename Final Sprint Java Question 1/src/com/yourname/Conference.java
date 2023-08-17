package com.yourname;

public class Conference {
    private Team[] teams;

    public Conference() {
        teams = new Team[10];
        initializeTeams(); // Initialize teams here or elsewhere as needed
    }

    private void initializeTeams() {
        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team(this); // Pass the conference to the Team constructor
        }
    }

    public Team[] getTeams() {
        return teams;
    }
}
