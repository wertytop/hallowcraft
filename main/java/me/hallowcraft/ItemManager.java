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
    public static ItemStack traineewand;
    public static ItemStack darknesswand;
    public static ItemStack lightwand;

    public static void init(){
        createRookieWand();
        createTraineeWand();
        createDarknessWand();
        createLightWand();
    }
    private static void createRookieWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aRookie's Staff");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        List<String> lore=new ArrayList<>();
        lore.add("§7'An utter piece of garbage.'");
        lore.add("§7        -Gorlock Greatsword");
        meta.setLore(lore);
        item.setItemMeta(meta);
        rookiewand=item;
    }
    private static void createTraineeWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9Trainee's Staff");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        List<String> lore=new ArrayList<>();
        lore.add("§7'Acceptable'");
        lore.add("§7        -Genitai Groot");
        meta.setLore(lore);
        item.setItemMeta(meta);
        traineewand=item;
    }
    private static void createDarknessWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Staff Of Darkness");
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        List<String> lore=new ArrayList<>();
        lore.add("§8'Great Powers fought over this wand'");
        lore.add("§8§l§keeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        meta.setLore(lore);
        item.setItemMeta(meta);
        darknesswand=item;
    }
    private static void createLightWand() {
        ItemStack item = new ItemStack(Material.SPECTRAL_ARROW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Staff Of Light");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        List<String> lore=new ArrayList<>();
        lore.add("§6'This wand shall restore peace to all'");
        lore.add("§6                 - Gorlock Greatsword");
        meta.setLore(lore);
        item.setItemMeta(meta);
        lightwand=item;
    }
}
