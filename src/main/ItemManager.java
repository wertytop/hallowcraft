package me.hallowcraft;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack rookiewand;

    public static void init(){
        createRookieWand();
    }
    private static void createRookieWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aRookie's Wand");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        List<String> lore=new ArrayList<>();
        lore.add("§9DMG(+10) Manna(+10) Terra (+5)");
        lore.add("§7An utter peice of garbage.");
        lore.add("§7        -Gorlock Greatsword");
        lore.add("");
        lore.add("");
        lore.add("§a§lUncommon");
        meta.setLore(lore);
        rookiewand=item;
    }
}
