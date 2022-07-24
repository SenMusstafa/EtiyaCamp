package gameHomeWork.Abstract;

import gameHomeWork.Entites.Game;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game oldGame,Game newGame);
	void getGames();
}
