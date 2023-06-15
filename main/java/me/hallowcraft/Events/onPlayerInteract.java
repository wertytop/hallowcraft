package me.hallowcraft.Events;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
import me.hallowcraft.Utils.raycastDamage;
import java.util.Objects;
import me.hallowcraft.Manna.MannaManager;

import static me.hallowcraft.Manna.MannaManager.Manna;


public class onPlayerInteract implements Listener {
    public onPlayerInteract() {

    }
    @EventHandler
    public boolean onInteract(PlayerInteractEvent e) throws InterruptedException {
        Player p = e.getPlayer();
        ItemStack item = p.getItemInHand();
        assert item != null;
        if (item.hasItemMeta()) {
            if (Objects.requireNonNull(item.getItemMeta()).hasLore()) {
                if (item.getItemMeta().getDisplayName().contains("Rookie's Staff")) {
                    if(Manna.get(p)>=5){
                        Location eyelocation = p.getEyeLocation();
                        Vector vec = p.getLocation().getDirection();
                        Location frontlocation = eyelocation.add(vec);

                        p.spawnParticle(Particle.FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.5);
                        p.spawnParticle(Particle.FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.3);
                        p.spawnParticle(Particle.FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.1);
                        p.spawnParticle(Particle.FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1);

                        raycastDamage.DamageRaycast(p, 10, 2);
                        MannaManager.RemoveManna(p, 5);
                        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bManna: " + Manna.get(p) + " §6(-5)"));
                    }else{
                        p.sendMessage("§cYou do not have enough manna");
                        p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,5,1);
                    }
                } else if (item.getItemMeta().getDisplayName().contains("Trainee's Staff")) {
                    if(Manna.get(p)>=4){
                        Location eyelocation = p.getEyeLocation();
                        Vector vec = p.getLocation().getDirection();
                        Location frontlocation = eyelocation.add(vec);

                        p.spawnParticle(Particle.SMALL_FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.5);
                        p.spawnParticle(Particle.SMALL_FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.3);
                        p.spawnParticle(Particle.SMALL_FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.1);
                        p.spawnParticle(Particle.SMALL_FLAME, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1);

                        raycastDamage.DamageRaycast(p, 15, 5);
                        MannaManager.RemoveManna(p, 4);
                        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bManna: " + Manna.get(p) + " §6(-4)"));
                    }else {
                        p.sendMessage("§cYou do not have enough manna");
                        p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,5,1);
                    }
                } else if (item.getItemMeta().getDisplayName().contains("Staff Of Darkness")) {
                    if(Manna.get(p)>=50){
                        Location eyelocation = p.getEyeLocation();
                        Vector vec = p.getLocation().getDirection();
                        Location frontlocation = eyelocation.add(vec);

                        p.spawnParticle(Particle.SCULK_SOUL, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 2.0);
                        p.spawnParticle(Particle.SCULK_SOUL, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.5);
                        p.spawnParticle(Particle.SCULK_SOUL, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1.1);
                        p.spawnParticle(Particle.SCULK_SOUL, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 1);
                        p.playSound(p.getLocation(),Sound.ENTITY_WARDEN_SONIC_BOOM,5,5);

                        raycastDamage.DamageRaycast(p, 30, 20);
                        MannaManager.RemoveManna(p, 50);
                        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bManna: " + Manna.get(p) + " §8§l(-50)"));
                    }else{
                        p.sendMessage("§cYou do not have enough manna");
                        p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,5,1);
                    }

                }else if (item.getItemMeta().getDisplayName().contains("Staff Of Light")) {
                    if(Manna.get(p)>=10){
                        Location eyelocation = p.getEyeLocation();
                        Vector vec = p.getLocation().getDirection();
                        Location frontlocation = eyelocation.add(vec);

                        p.spawnParticle(Particle.TOTEM, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 10);
                        p.spawnParticle(Particle.TOTEM, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 5);
                        p.spawnParticle(Particle.TOTEM, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 6);
                        p.spawnParticle(Particle.TOTEM, frontlocation, 0, vec.getX(), vec.getY(), vec.getZ(), 6);
                        p.playSound(p.getLocation(),Sound.BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON,5,5);

                        raycastDamage.DamageRaycast(p, 50, 10);
                        MannaManager.RemoveManna(p, 10);
                        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§bManna: " + Manna.get(p) + " §8§l(-10)"));
                    }else{
                        p.sendMessage("§cYou do not have enough manna");
                        p.playSound(p.getLocation(),Sound.ENTITY_VILLAGER_NO,5,1);
                    }

                }
            }
        } else {
            return false;
        }return false;
    }
}
