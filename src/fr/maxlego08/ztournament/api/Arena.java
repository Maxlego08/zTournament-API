package fr.maxlego08.ztournament.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

public interface Arena {

	/**
	 * 
	 * @return
	 */
	UUID getId();

	/**
	 * 
	 * @return
	 */
	Location getPos1();

	/**
	 * 
	 * @return
	 */
	Location getPos2();

	/**
	 * 
	 * @return
	 */
	List<Duel> getTeams();

	/**
	 * 
	 * @return
	 */
	int size();
	
	/**
	 * 
	 * @return
	 */
	boolean hasTeams();
	
	/**
	 * 
	 * @param team
	 */
	void addDuel(Duel team);
	
	/**
	 * 
	 * @param team
	 */
	void removeDuel(Duel team);

	/**
	 * 
	 */
	void clear();
	
}
