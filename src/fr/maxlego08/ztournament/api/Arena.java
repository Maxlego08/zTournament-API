package fr.maxlego08.ztournament.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;

public interface Arena {

	/**
	 * 
	 * @return uuid
	 */
	@Deprecated
	UUID getId();

	/**
	 * Get unique id
	 * 
	 * @return
	 */
	UUID getUniqueId();

	/**
	 * 
	 * @return {@link Location}
	 */
	Location getPos1();

	/**
	 * 
	 * @return {@link Location}
	 */
	Location getPos2();

	/**
	 * 
	 * @return location as string
	 */
	String getPos1String();

	/**
	 * 
	 * @return location as string
	 */
	String getPos2String();

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

	/**
	 * 
	 * @return arena name
	 */
	String getName();

	/**
	 * 
	 * @param name
	 */
	void setName(String name);

	/**
	 * 
	 * @param location
	 */
	void setPos1(Location location);

	/**
	 * 
	 * @param location
	 */
	void setPos2(Location location);
}
