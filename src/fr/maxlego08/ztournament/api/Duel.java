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
	 * @return team
	 */
	Team getTeam();

	/**
	 * Start duel
	 * @param location
	 * @param location2
	 */
	void startDuel(Location location, Location location2);

	/**
	 * 
	 * @param team
	 * @return boolean
	 */
	boolean match(Team team);

	/**
	 * When player loose
	 * @param player
	 */
	void onPlayerLoose(Player player);

	/**
	 * 
	 * @return boolean
	 */
	boolean hasWinner();

	/**
	 * Get winner
	 * @return team
	 */
	Team getWinner();

	/**
	 * Get looser
	 * @return team
	 */
	Team getLooser();

	/**
	 * 
	 * @param string
	 */
	void message(String string);

	/**
	 * Heal teams
	 */
	void heal();

	/**
	 * 
	 * @param team
	 * @return team
	 */
	Team getOpponent(Team team);

	/**
	 * 
	 * @return boolean
	 */
	boolean isDuel();

	/**
	 * Set arena
	 * @param arena
	 */
	void setArenea(Arena arena);

	/**
	 * Get arena
	 * @return arena
	 */ 
	Arena getArena();
}
