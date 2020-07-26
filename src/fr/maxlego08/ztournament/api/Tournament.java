package fr.maxlego08.ztournament.api;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.Reward;
import fr.maxlego08.ztournament.zcore.utils.storage.Saveable;

public interface Tournament extends Saveable {

	/**
	 * Get team by name
	 * @param name
	 * @return team
	 */
	Team getByName(String name);

	/**
	 * Get team by player
	 * @param player
	 * @return team
	 */
	Team getByPlayer(Player player);

	/**
	 * Get duel by team
	 * @param team
	 * @return duel
	 */
	Duel getDuel(Team team);

	/**
	 * Get Arena for duel
	 * @return arena
	 */
	Arena getAvaibleArena();

	/**
	 * Get amount of avaible arena
	 * @return amount
	 */
	int getAvaibleArenaCount();

	/**
	 * Get team that's going to move on to the next round.
	 * @return team
	 */
	Team getByPassTeam();

	/**
	 * Clear player
	 * @param player
	 */
	void clearPlayer(Player player);

	/**
	 * Get team random
	 * @return team
	 */
	Team getRandomTeam();

	/**
	 * Get duel amound
	 * @return amount
	 */
	int getDuelTeam();

	/**
	 * Set lobby location
	 * @param sender
	 * @param location
	 */
	void setLobbyLocation(Player sender, Location location);

	/**
	 * Create random duel
	 */
	void createRandomDuel();

	/**
	 * Create arena
	 * @param sender
	 * @param pos1
	 * @param pos2
	 */
	void createArena(CommandSender sender, Location pos1, Location pos2);

	/**
	 * Send arena list
	 * @param player
	 */
	void sendArena(Player player);

	/**
	 * Delete arena
	 * @param sender
	 * @param uuid
	 */
	void deleteArena(CommandSender sender, UUID uuid);

	/**
	 * Lets you know if a player can type another one during a duel.
	 * @param player
	 * @param damager
	 * @return boolean
	 */
	boolean canHurt(Player player, Player damager);

	/**
	 * Allows to know if the player's inventory contains items
	 * @param player
	 * @return true or false
	 */
	boolean inventoryHasItem(Player player);

	/**
	 * Remove player from his team
	 * @param player
	 */
	void removeTeam(Player player);

	/**
	 * Check if the teams are valid
	 */
	void checkTeam();

	/**
	 * Start tournois
	 * @param sender
	 * @param type
	 * @param kit
	 */
	void startTournois(CommandSender sender, TournoisType type, Kit kit);

	/**
	 * Start
	 */
	void start();

	/**
	 * Start wave
	 */
	void startWave();

	/**
	 * End tournament
	 */
	void end();

	/**
	 * Create a team
	 * @param player
	 * @param name
	 */
	void createTeam(Player player, String name);

	/**
	 * Join a team
	 * @param player
	 * @param name
	 */
	void joinTeam(Player player, String name);

	/**
	 * Invite a player
	 * @param player
	 * @param target
	 */
	void invitePlayer(Player player, Player target);

	/**
	 * Leave team
	 * @param player
	 * @param message
	 */
	void leave(Player player, boolean message);

	/**
	 * When team loose duel
	 * @param team
	 * @param duel
	 * @param player
	 */
	void loose(Team team, Duel duel, Player player);

	/**
	 * Allows to know if all duels are over, if yes then the next round will start automatically.
	 */
	void canStartNextWave();

	/**
	 * if sender can use command on duel
	 * @param sender
	 * @return true
	 */
	boolean canUseCommand(CommandSender sender);

	/**
	 * Stop tournament
	 * @param sender
	 */
	void stopTournois(CommandSender sender);

	/**
	 * Start next wave
	 * @param sender
	 */
	void nextWave(CommandSender sender);

	/**
	 * 
	 * @return if is start
	 */
	boolean isStart();

	/**
	 * 
	 * @return if is waiting
	 */
	boolean isWaiting();

	/**
	 * Get lobby location
	 * @return location
	 */
	Location getLocation();

	/**
	 * 
	 * @return if is time between wave
	 */
	boolean isTimeBetweenWave();
	
	/**
	 * Get NMS interface
	 * @return nms
	 */
	NMS getNMS();
	
	/**
	 * When plugin disable
	 */
	void onPluginDisable();

	/**
	 * Get reward by position
	 * @param position
	 * @return reward
	 */
	Reward getReward(int position);
	
	/**
	 * Get kit manager
	 * @return kits manager
	 */
	Kits getKits();
	
	/**
	 * 
	 * @return current kit use
	 */
	Kit getKit();
	
}
