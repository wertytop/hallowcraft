package me.hallowcraft.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import me.hallowcraft.Manna.MannaManager;

import static me.hallowcraft.Manna.MannaManager.Manna;
import static me.hallowcraft.Manna.MannaManager.MaxManna;

public class onJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        Manna.put(p,100);
        MaxManna.put(p,100);
    }
}
