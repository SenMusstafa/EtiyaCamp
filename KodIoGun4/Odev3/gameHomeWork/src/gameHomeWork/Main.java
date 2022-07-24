package gameHomeWork;

import java.sql.Date;
import java.time.LocalDate;

import gameHomeWork.Concrete.CampainManager;
import gameHomeWork.Concrete.GameManager;
import gameHomeWork.Concrete.PlayerManager;
import gameHomeWork.Concrete.StoreManager;
import gameHomeWork.Entites.Campain;
import gameHomeWork.Entites.Game;
import gameHomeWork.Entites.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager();
		Player player = new Player(1, "Mustafa", "Şen", new Date(1992), "33333333333");
		Player player2 = new Player(2, "Fırat", "Ozbora",new Date(1992) ,"55555555555");
		Player player3 = new Player(2,"Simge","Dilmaç",new Date(1995),"99999999999");
		
		playerManager.add(player);
		playerManager.delete(player2);
		playerManager.update(player2, player3);
		
		playerManager.getPlayers();
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game(1,"GTA5","Arcade",450);
		Game game2 = new Game(2, "Fifa22", "Sports", 550);
		Game game3 = new Game(3,"CoD:MWF","Battle",500);
		
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		System.out.println("Game list");
		gameManager.getGames();
		
		player.setGames(game1);
		player2.setGames(game2);
		player3.setGames(game3);
		
		Campain campain = new Campain(1,"Summer",LocalDate.of(2022, 06, 10),LocalDate.of(2022, 06, 17));
		Campain campain2= new Campain(2,"Autumn",LocalDate.of(2022,10,17),LocalDate.of(2022,10,17));
		
		
		campain.setGames(game1);
		campain.setGames(game2);
		campain.setGames(game3);
		CampainManager campainManager = new CampainManager();
		campainManager.add(campain2);
		
		System.out.println("Store buy Game ");
		StoreManager storeManager = new StoreManager();
		
		storeManager.sell(campain, player2,1);
		storeManager.sell(campain, player,2);
		
		for(Game gameElement : player3.getGames()) {
			System.out.println(gameElement.getGameName());
		}
	}

}
