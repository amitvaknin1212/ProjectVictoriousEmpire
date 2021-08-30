package com.pe1.projectempire.core.init;

import com.pe1.projectempire.ProjectEmpire;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			ProjectEmpire.MOD_ID);
	public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
			() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

}
