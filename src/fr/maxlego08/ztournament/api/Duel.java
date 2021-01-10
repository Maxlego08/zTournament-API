package fr.maxlego08.ztournament.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Duel {

	/**
	 * 
	 * @return team
	 */
	Team getOpponant();

	/**
	 * 
	 * @return
	 */
	Team getTeam();

	/**
	 * 
	 * @param location
	 * @param location2
	 */
	void startDuel(Location location, Location location2);

	/**
	 * 
	 * @param team
	 * @return
	 */
	boolean match(Team team);

	/**
	 * 
	 * @param player
	 */
	void onPlayerLoose(Player player);

	/**
	 * 
	 * @return
	 */
	boolean hasWinner();

	/**
	 * 
	 * @return
	 */
	Team getWinner();

	/**
	 * 
	 * @return
	 */
	Team getLooser();

	/**
	 * 
	 * @param string
	 */
	void message(String string);

	/**
	 * 
	 */
	void heal();

	/**
	 * 
	 * @param team
	 * @return
	 */
	Team getOpponent(Team team);

	/**
	 * 
	 * @return
	 */
	boolean isDuel();

	/**
	 * 
	 * @param arena
	 */
	void setArenea(Arena arena);

	/**
	 * 
	 * @return
	 */
	Arena getArena();
}
