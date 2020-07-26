package fr.maxlego08.ztournament.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

public interface Arena {

	/**
	 * Get arena id
	 * @return uuid
	 */
	UUID getId();

	/**
	 * Get pos1
	 * @return location
	 */
	Location getPos1();

	/**
	 * Get pos2
	 * @return location
	 */
	Location getPos2();

	/**
	 * Get duels
	 * @return duels
	 */
	List<Duel> getTeams();

	/**
	 * Get duels size
	 * @return amount
	 */
	int size();
	
	/**
	 * 
	 * @return boolean
	 */
	boolean hasTeams();
	
	/**
	 * Add duel
	 * @param team
	 */
	void addDuel(Duel team);
	
	/**
	 * Remove duel
	 * @param team
	 */
	void removeDuel(Duel team);

	/**
	 * Clear list
	 */
	void clear();
	
}
