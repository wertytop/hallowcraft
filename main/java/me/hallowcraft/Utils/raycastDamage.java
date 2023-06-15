package me.hallowcraft.Utils;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class raycastDamage {

    private static boolean getLookingAt(Player player, LivingEntity livingEntity){
        Location eye = player.getEyeLocation();
        Vector toEntity = livingEntity.getEyeLocation().toVector().subtract(eye.toVector());
        double dot = toEntity.normalize().dot(eye.getDirection());

        return dot > 0.99D;
    }
    public static void DamageRaycast(Player player, int distance, int damage) throws InterruptedException {
        for(Entity d : player.getNearbyEntities(distance, distance, distance)){

            LivingEntity entity = (LivingEntity) d;
            if(getLookingAt(player,entity)){

                entity.damage(damage);
            }
        }
    }

}
