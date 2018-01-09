package Lab7.src.assignment7;

import java.util.HashMap;

public class Team {

	
	private HashMap<String, Player> player = new HashMap<String, Player>();

	public void put(String string, Player players) {
		player.put(string, players);
	
	}

	/*public double getNumGoals(String string) {
		return player.get(string);
	}

	public double getAveAge(String string) {
		return player.get(string);
	}

	public double getPlayers() {
		
		return player.size();
	}*/
}
