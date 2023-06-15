package me.hallowcraft.Manna;

import org.bukkit.entity.Player;
import java.util.HashMap;

public class MannaManager {
    public static HashMap<Player, Integer> Manna = new HashMap<Player, Integer>();
    public static HashMap<Player, Integer> MaxManna = new HashMap<Player, Integer>();
    public static void RemoveManna(Player player, Integer amount) {
        int tempmana = Manna.get(player);
        Manna.put(player, tempmana - amount);
    }
}
