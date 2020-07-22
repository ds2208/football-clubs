package main;

import java.util.ArrayList;

import competitions.FootballClub;
import competitions.League;
import players.Coach;
import players.FootballPlayer;

public class MainClass {

	public static void main(String[] args) {
		
		Coach coach1 = new Coach("Jirguen", "Clopp", "2208994731324", "Dalmatinska 60", 15, "New Balance", 25, 15);
		ArrayList<FootballPlayer> players1 = new ArrayList<FootballPlayer>();
		players1.add(new FootballPlayer("Mohamed", "Salah", "1234567897894", "Dalmatinska 90", 300000, 4, "Adidas", false, 23, 12));
		ArrayList<FootballClub> clubs1 = new ArrayList<FootballClub>();
		clubs1.add(new FootballClub("Liverpool", coach1, players1, 15, 15));
		League league1 = new League("Premier League", "Nike", clubs1);
		
		System.out.println(league1.getClubs().get(0).getClubName());
		System.out.println(league1.getClubs().get(0).getPlayers().get(0).getPrezime());
		System.out.println(league1.getClubs().get(0).getPlayers().get(0).getSponsor());
		
		}

}
