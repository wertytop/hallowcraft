package me.hallowcraft.Commands;

import me.hallowcraft.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class giveitem implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player senderplayer = (Player) sender;
        if (args.length==0){sender.sendMessage("§bYou must provide at least 1 argument");}
        if (args[0].equals("rookiewand")){senderplayer.getInventory().addItem(ItemManager.rookiewand);}
        else{sender.sendMessage("§binvalid args. You still r valid dw :3 btw here r ur args : "+args[0]);}
        return false;
    }
}