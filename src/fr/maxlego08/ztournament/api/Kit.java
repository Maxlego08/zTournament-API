package fr.maxlego08.ztournament.api;

import java.util.Map;

import org.bukkit.inventory.ItemStack;

public interface Kit {

	/**
	 * 
	 * @return
	 */
	String getName();

	/**
	 * 
	 * @return
	 */
	ItemStack getLeggings();

	/**
	 * 
	 * @return
	 */
	ItemStack getHelmet();

	/**
	 * 
	 * @return
	 */
	ItemStack getChestplate();

	/**
	 * 
	 * @return
	 */
	ItemStack getBoots();

	/**
	 * 
	 * @return
	 */
	Map<Integer, ItemStack> getItems();

	/**
	 * 
	 * @param itemStack
	 */
	void setLeggings(ItemStack itemStack);

	/**
	 * 
	 * @param itemStack
	 */
	void setBoots(ItemStack itemStack);

	/**
	 * 
	 * @param itemStack
	 */
	void setChestplate(ItemStack itemStack);

	/**
	 * 
	 * @param itemStack
	 */
	void setHelmet(ItemStack itemStack);

	/**
	 * 
	 * @param items
	 */
	void setItems(Map<Integer, ItemStack> items);

}
