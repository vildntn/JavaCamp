package Concreate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("The game called: "+game.getGameName()+ "\nThe Game Price: "+game.getPrice()+ " has been added.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " game has been deleted.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " game has been updated.");
		
	}

}
