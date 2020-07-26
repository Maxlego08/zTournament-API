package fr.maxlego08.ztournament.api;

import java.util.Map;

import org.bukkit.inventory.ItemStack;

public interface Kit {

	/**
	 * 
	 * @return name
	 */
	String getName();

	/**
	 * Get leggings
	 * @return itemstack
	 */
	ItemStack getLeggings();

	/**
	 * getHelmet
	 * @return itemstack
	 */
	ItemStack getHelmet();

	/**
	 * Get checkplate
	 * @return itemstack
	 */
	ItemStack getChestplate();

	/**
	 * Get boots
	 * @return itemstack
	 */
	ItemStack getBoots();

	/**
	 * Get items
	 * @return items
	 */
	Map<Integer, ItemStack> getItems();

	/**
	 * Set leggings
	 * @param itemStack
	 */
	void setLeggings(ItemStack itemStack);

	/**
	 * Set boots
	 * @param itemStack
	 */
	void setBoots(ItemStack itemStack);

	/**
	 * Set chestplate
	 * @param itemStack
	 */
	void setChestplate(ItemStack itemStack);

	/**
	 * Set leggings
	 * @param itemStack
	 */
	void setHelmet(ItemStack itemStack);

	/**
	 * Set items
	 * @param items
	 */
	void setItems(Map<Integer, ItemStack> items);

}
