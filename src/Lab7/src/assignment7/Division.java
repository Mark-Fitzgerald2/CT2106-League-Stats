package Lab7.src.assignment7;

import java.util.HashMap;

public class Division {
	
	private HashMap<String, Team> map = new HashMap<String, Team>();

	public void put(String string, Team team) {
		map.put(string, team);
		
	}

	public int getNumTeams2() {
		// TODO Auto-generated method stub
		return map.size();
	}

	public int getNumTeams() {
		
		return map.size();
	}
}
