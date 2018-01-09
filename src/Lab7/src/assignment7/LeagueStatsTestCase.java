package Lab7.src.assignment7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LeagueStatsTestCase {
	
	LeagueStats leagueStats = new LeagueStats();
	
	League league;
	
	Division premiership;
	Division championship;
	
	Team ipswich;
	Team leicester;
	Team galwayUTD;
	Team bohemians;
	
	Player chambers;
	Player bishop;
	Player pitman;
	
	Player mahrez;
	Player drinkwater;
	Player vardy;
	
	Player horgan;
	Player walsh;
	Player curran;
	 
	Player kelly;
	Player delaney;
	Player lopez;
	
	@Before
	public void setUp() throws Exception {
		league = new League("League of Ireland");
		leagueStats.add(league);
		
		premiership = new Division();
		league.put("Premiership", premiership);
		championship = new Division();
		league.put("Championship", championship);
		
		ipswich = new Team();
		premiership.put("Ipswich", ipswich);
		leicester = new Team();
		premiership.put("Leicester", leicester);
		galwayUTD= new Team();
		championship.put("GalwayUTD", galwayUTD);
		bohemians = new Team();
		championship.put("Bohemians", bohemians);
		
		chambers = new Player();
		bishop = new Player();
		pitman = new Player();
		ipswich.put("Chambers", chambers);
		ipswich.put("Bishop", bishop);
		ipswich.put("Pitman", pitman);
		
		mahrez = new Player();
		drinkwater = new Player();
		vardy = new Player();
		leicester.put("Mahrez", mahrez);
		leicester.put("Drinkwater", drinkwater);
		leicester.put("Vardy", vardy);
		
		horgan = new Player();
		walsh = new Player();
		curran = new Player();
		galwayUTD.put("Horgan", horgan);
		galwayUTD.put("Walsh", walsh);
		galwayUTD.put("Curran", curran);
		
		kelly = new Player();
		delaney = new Player();
		lopez = new Player();
		bohemians.put("Kelly", kelly);
		bohemians.put("Delaney", delaney);
		bohemians.put("Lopez", lopez);
		
	}

	@Test
	public void getNumDivisionsTest2() {
		int expected = 2;
		int actualResult = leagueStats.getNumDivisions2();
		assertEquals(expected, actualResult);
	}
	
	@Test
	public void getNumTeamTest2() {
		int expected = 4;
		int actualResult = leagueStats.getNumTeams("Premiership") + leagueStats.getNumTeams("Championship");
		assertEquals(expected, actualResult);
	}
	
	/*@Test
	public void getNumGoalsForPremiershipTest() {
		double expected = 43;
		double actualLeic = leicester.getNumGoals("Drinkwater") + leicester.getNumGoals("Vardy") + leicester.getNumGoals("Mahrez");
		double actualIp = ipswich.getNumGoals("Chambers") + ipswich.getNumGoals("Bishop") + ipswich.getNumGoals("Pitman");
		double actualResult = actualLeic + actualIp;
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getNumGoalsForChampionshipTest() {
		double expected = 39;
		double actualGal = galwayUTD.getNumGoals("Horgan") + galwayUTD.getNumGoals("Walsh") + galwayUTD.getNumGoals("Curran");
		double actualBohs = bohemians.getNumGoals("Kelly") + bohemians.getNumGoals("Delaney") + bohemians.getNumGoals("Lopez");
		double actualResult = actualGal + actualBohs;
		assertEquals(expected, actualResult, 0.1);
	}

	@Test
	public void getNumGoalsForIpTest() {
		double expected = 22;
		double actualResult = ipswich.getNumGoals("Chambers") + ipswich.getNumGoals("Bishop") + ipswich.getNumGoals("Pitman");
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getNumGoalsForLeicTest() {
		double expected = 21;
		double actualResult =leicester.getNumGoals("Drinkwater") + leicester.getNumGoals("Vardy") + leicester.getNumGoals("Mahrez");
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getNumGoalsForGalTest() {
		double expected = 18;
		double actualResult = galwayUTD.getNumGoals("Horgan") + galwayUTD.getNumGoals("Walsh") + galwayUTD.getNumGoals("Curran");
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getNumGoalsForbohsTest() {
		double expected = 21;
		double actualResult = bohemians.getNumGoals("Kelly") + bohemians.getNumGoals("Delaney") + bohemians.getNumGoals("Lopez");
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getAveAgeIpTest() {
		double expected = 28;
		double actualResult = (ipswich.getAveAge("Chambers") + ipswich.getAveAge("Bishop") + ipswich.getAveAge("Pitman")) / ipswich.getPlayers();
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getAveAgeLeicTest() {
		double expected = 26;
		double actualResult = (leicester.getAveAge("Drinkwater") + leicester.getAveAge("Vardy") + leicester.getAveAge("Mahrez")) / leicester.getPlayers();
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getAveAgeGalTest() {
		double expected = 23;
		double actualResult = (galwayUTD.getAveAge("Horgan") + galwayUTD.getAveAge("Walsh") + galwayUTD.getAveAge("Curran")) / galwayUTD.getPlayers();
		assertEquals(expected, actualResult, 0.1);
	}
	
	@Test
	public void getAveAgeBohsTest() {
		double expected = 25;
		double actualResult = (bohemians.getAveAge("Kelly") + bohemians.getAveAge("Delaney") + bohemians.getAveAge("Lopez")) / bohemians.getPlayers();
		assertEquals(expected, actualResult, 0.1);
	}*/

}