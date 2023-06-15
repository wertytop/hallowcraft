package me.hallowcraft;

import me.hallowcraft.Commands.giveitem;
import me.hallowcraft.Events.onJoin;
import me.hallowcraft.Events.onPlayerInteract;
import me.hallowcraft.Manna.MannaManager;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.Objects;

import static me.hallowcraft.Manna.MannaManager.Manna;
import static me.hallowcraft.Manna.MannaManager.MaxManna;
import me.hallowcraft.ItemManager;

public final class HallowCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        Objects.requireNonNull(getCommand("giveitem")).setExecutor((CommandExecutor) new giveitem());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new onPlayerInteract(), this);
        pluginManager.registerEvents(new onJoin(), this);
        BukkitScheduler scheduler = getServer().getScheduler();
        ShapedRecipe rookiewand = new ShapedRecipe(ItemManager.rookiewand);
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                for (Player e : Bukkit.getOnlinePlayers()) {
                    if (MannaManager.Manna.get(e) < MaxManna.get(e)) {
                        MannaManager.Manna.put(e, MannaManager.Manna.get(e) + (MannaManager.MaxManna.get(e)/25));
                    }
                }

            }
        }, 0L, 20L);
        scheduler.scheduleSyncRepeatingTask(this, new Runnable() {

            @Override
            public void run() {
                for (Player e : Bukkit.getOnlinePlayers()) {
                    e.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bManna: "+ Manna.get(e)));                }
            }
        },0L,20);
        rookiewand.shape("*","B","B");

        rookiewand.setIngredient('*', Material.IRON_BLOCK);
        rookiewand.setIngredient('B', Material.STICK);

        ShapedRecipe traineewand = new ShapedRecipe(ItemManager.traineewand);
        traineewand.shape("*","B","B");

        traineewand.setIngredient('*', Material.DIAMOND_BLOCK,2);
        traineewand.setIngredient('B', Material.STICK);

        ShapedRecipe darknesswand = new ShapedRecipe(ItemManager.darknesswand);
        darknesswand.shape("*","B","B");

        darknesswand.setIngredient('*', Material.NETHERITE_BLOCK);
        darknesswand.setIngredient('B', Material.BLAZE_ROD);

        ShapedRecipe lightwand = new ShapedRecipe(ItemManager.lightwand);
        lightwand.shape("*","B","B");

        lightwand.setIngredient('*', Material.BEACON);
        lightwand.setIngredient('B', Material.STICK);

        getServer().addRecipe(rookiewand);
        getServer().addRecipe(traineewand);
        getServer().addRecipe(lightwand);
        getServer().addRecipe(darknesswand);
    }

    @Override
    public void onDisable() {
    }
}
