package fr.maxlego08.ztournament.api;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.maxlego08.ztournament.zcore.utils.storage.Saveable;

public interface Kits extends Saveable{

	/**
	 * Get kit by name
	 * @param name
	 * @return kit
	 */
	Kit getKit(String name);
	
	/**
	 * Check if kit exit
	 * @param name
	 * @return boolean
	 */
	boolean existKit(String name);
	
	/**
	 * Create kit
	 * @param sender
	 * @param name
	 */
	void createKit(CommandSender sender, String name);
	
	/**
	 * Edit kit
	 * @param player
	 * @param name
	 */
	void editKit(Player player, String name);
	
	/**
	 * Show kit
	 * @param player
	 * @param name
	 */
	void showKit(Player player, String name);
	
	/**
	 * Delete kit
	 * @param sender
	 * @param name
	 */
	void deleteKit(CommandSender sender, String name);
	
	/**
	 * Get kits name
	 * @return list
	 */
	List<String> getNames();
}
