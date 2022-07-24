package gameHomeWork.Entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import gameHomeWork.Abstract.Entity;

public class Campain implements Entity{
	private int campainId;
	private String campainName;
	private LocalDate beginDate;
	private LocalDate dueDate;
	private List<Game> games;
	
	public Campain() {
	
	}
	public Campain(int campainId, String campainName, LocalDate beginDate, LocalDate dueDate) {
		super();
		this.campainId = campainId;
		this.campainName = campainName;
		this.beginDate = beginDate;
		this.dueDate = dueDate;
		this.games = new ArrayList<Game>();
	}
	public int getCampainId() {
		return campainId;
	}
	public void setCampainId(int campainId) {
		this.campainId = campainId;
	}
	public String getCampainName() {
		return campainName;
	}
	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}
	public LocalDate getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public List<Game> getGames() {
		return games;
	}

	public void setGames(Game game) {
		this.games.add(game);
	}
}
