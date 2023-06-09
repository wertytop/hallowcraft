package me.hallowcraft;

import me.hallowcraft.Commands.giveitem;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class HallowCraft extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        Objects.requireNonNull(getCommand("giveitem")).setExecutor((CommandExecutor) new giveitem());
    }

    @Override
    public void onDisable() {
    }
}
