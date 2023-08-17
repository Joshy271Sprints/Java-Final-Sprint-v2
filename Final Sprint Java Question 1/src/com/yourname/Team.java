package com.yourname;

public class Team {
    private Conference conference;
    private Player[] players;

    public Team(Conference conference) {
        this.conference = conference;
        players = new Player[12];
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                player.setTeam(this);
                return;
            }
        }
        System.out.println("Team is full. Cannot add more players.");
    }

    public void removePlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) {
                players[i] = null;
                player.setTeam(null);
                return;
            }
        }
    }

    public void transferPlayer(Player player, Team newTeam) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) {
                players[i] = null;  // Remove player from current team
                player.setTeam(null);

                newTeam.addPlayer(player);  // Add player to the new team
                return;
            }
        }
        System.out.println("Player not found in this team.");
    }

    public Player[] getPlayers() {
        return players;
    }

    public Conference getConference() {
        return conference;
    }

    // Other methods related to the Team class
}
