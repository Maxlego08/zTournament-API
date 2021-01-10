package fr.maxlego08.ztournament.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.zcore.enums.Message;

public interface Team {

	/**
	 * 
	 * @param message
	 * @param args
	 */
	void message(String message, Object... args);

	/**
	 * 
	 * @param location
	 */
	void teleport(Location location);

	/**
	 * 
	 */
	void clear();

	/**
	 * 
	 */
	void give();

	/**
	 * 
	 * @param player
	 */
	void give(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean match(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean join(Player player);

	/**
	 * 
	 * @param team
	 */
	void show(Team team);

	/**
	 * 
	 * @param team
	 */
	void hide(Team team);

	/**
	 * 
	 */
	void heal();

	/**
	 * 
	 * @return
	 */
	boolean hasLoose();

	/**
	 * 
	 */
	void show();

	/**
	 * 
	 */
	void hide();

	/**
	 * 
	 * @return
	 */
	String getName();

	/**
	 * 
	 * @return
	 */
	int getMaxPlayers();

	/**
	 * 
	 * @return
	 */
	List<Player> getPlayers();

	/**
	 * 
	 * @return
	 */
	List<String> getUsers();

	/**
	 * 
	 * @return
	 */
	Player getOwner();

	/**
	 * 
	 * @param player
	 */
	void death(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean contains(Player player);

	/**
	 * 
	 */
	void disband();

	/**
	 * 
	 * @param player
	 */
	void leave(Player player);

	/**
	 * 
	 * @return
	 */
	boolean isInDuel();

	/**
	 * 
	 * @param b
	 */
	void setInDuel(boolean b);

	/**
	 * 
	 */
	void reMap();

	/**
	 * 
	 * @return
	 */
	List<OfflinePlayer> getRealPlayers();

	/**
	 * 
	 * @param zPlayer
	 * @return
	 */
	boolean isAlive(Player zPlayer);

	/**
	 * 
	 * @param player
	 */
	void invite(Player player);

	/**
	 * 
	 * @param player
	 */
	void removeInvite(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean isInvite(Player player);

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean isOwner(Player player);

	/**
	 * 
	 * @return
	 */
	int getPosition();

	/**
	 * 
	 * @param position
	 */
	void setPosition(int position);

	/**
	 * 
	 * @return
	 */
	boolean isValid();

	/**
	 * 
	 * @param message
	 */
	void message(Message message);
	
	/**
	 * 
	 * @return
	 */
	Kit getKit();

	/**
	 * 
	 * @param player
	 * @return
	 */
	boolean match(OfflinePlayer player);

}
