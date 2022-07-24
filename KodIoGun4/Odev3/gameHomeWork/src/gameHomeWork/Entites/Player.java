package gameHomeWork.Entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gameHomeWork.Abstract.Entity;

public class Player implements Entity{
	private int playerId;
	private String firstName;
	private String lastName;
	private Date birthYear;
	private String nationalIdentity;
	private List<Game> games;
	public Player() {
	}
	public Player(int playerId, String firstName, String lastName, Date birthYear, String nationalIdentity) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.nationalIdentity = nationalIdentity;
		this.games = new ArrayList<Game>();
	}
	public int getPersonId() {
		return playerId;
	}
	public void setPersonId(int personId) {
		this.playerId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(Date birthYear) {
		this.birthYear = birthYear;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(Game list) {
		this.games.add((Game) list);
	}
	public Object indexOf(Player player) {
		// TODO Auto-generated method stub
		return null;
		
	}
	
}
