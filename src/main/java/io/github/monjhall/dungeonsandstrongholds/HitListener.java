package io.github.monjhall.dungeonsandstrongholds;

import javafx.scene.effect.Glow;
import org.bukkit.Color;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class HitListener implements Listener {

    @EventHandler
    public void OnHitEventHandler(EntityDamageByEntityEvent HitEvent)
    {
        // Create a potion effect for tracking glow.
        PotionEffect GlowingEffect = new PotionEffect(PotionEffectType.GLOWING, 100, 5,true, true, Color.ORANGE);
        GlowingEffect.apply((LivingEntity)HitEvent.getEntity());
    }
}
