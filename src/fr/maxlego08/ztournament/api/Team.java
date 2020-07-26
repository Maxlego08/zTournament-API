package fr.maxlego08.ztournament.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.zcore.enums.Message;

public interface Team {

	/**
	 * Send message
	 * @param message
	 * @param args
	 */
	void message(String message, Object... args);

	/**
	 * Teleport team to location
	 * @param location
	 */
	void teleport(Location location);

	/**
	 * Clear team inventory
	 */
	void clear();

	/**
	 * Give kit to team
	 */
	void give();

	/**
	 * Give kit to player
	 * @param player
	 */
	void give(Player player);

	/**
	 * Check if player is in team
	 * @param player
	 * @return true if player is in team
	 */
	boolean match(Player player);

	/**
	 * Join team
	 * @param player
	 * @return true if player has join
	 */
	boolean join(Player player);

	/**
	 * Show team
	 * @param team
	 */
	void show(Team team);

	/**
	 * Hide team
	 * @param team
	 */
	void hide(Team team);

	/**
	 * Heal team
	 */
	void heal();

	/**
	 * Check if team has loose
	 * @return boolean
	 */
	boolean hasLoose();

	/**
	 * Show every player
	 */
	void show();

	/**
	 * Hide every player
	 */
	void hide();

	/**
	 * Get team name
	 * @return name
	 */
	String getName();

	/**
	 * Get max player in team
	 * @return amount
	 */
	int getMaxPlayers();

	/**
	 * Get online players
	 * @return players
	 */
	List<Player> getPlayers();

	/**
	 * Get all player name
	 * @return players
	 */
	List<String> getUsers();

	/**
	 * Get team owner
	 * @return player
	 */
	Player getOwner();

	/**
	 * When player death
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
	 * Disband team
	 */
	void disband();

	/**
	 * Player leave team
	 * @param player
	 */
	void leave(Player player);

	/**
	 * 
	 * @return true
	 */
	boolean isInDuel();

	/**
	 * Set team in duel
	 * @param boolean
	 */
	void setInDuel(boolean b);

	/**
	 * 
	 */
	void reMap();

	/**
	 * Get every players from team
	 * @return players
	 */
	List<OfflinePlayer> getRealPlayers();

	/**
	 * if player is alive
	 * @param zPlayer
	 * @return boolean
	 */
	boolean isAlive(Player zPlayer);

	/**
	 * Invite a player
	 * @param player
	 */
	void invite(Player player);

	/**
	 * Remove invite for a player
	 * @param player
	 */
	void removeInvite(Player player);

	/**
	 * Check if player is invite
	 * @param player
	 * @return boolean
	 */
	boolean isInvite(Player player);

	/**
	 * Check if player is owner
	 * @param player
	 * @return boolean
	 */
	boolean isOwner(Player player);

	/**
	 * Get team position
	 * @return position
	 */
	int getPosition();

	/**
	 * Set team position
	 * @param position
	 */
	void setPosition(int position);

	/**
	 * Check if team is valid
	 * @return boolean
	 */
	boolean isValid();

	/**
	 * Send message
	 * @param message
	 */
	void message(Message message);
	
	/**
	 * Get kit
	 * @return kit
	 */
	Kit getKit();

}
