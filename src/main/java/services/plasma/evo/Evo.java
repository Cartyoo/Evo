package services.plasma.evo;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.Sound;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class Evo extends JavaPlugin {

    @Override
    public void onEnable() {

        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();

        protocolManager.addPacketListener(new PacketAdapter(
                this,
                ListenerPriority.HIGHEST,
                PacketType.Play.Server.NAMED_SOUND_EFFECT
        ) {
            @Override
            public void onPacketSending(PacketEvent event) {
                if(event.getPacketType() == PacketType.Play.Server.NAMED_SOUND_EFFECT) {
                    PacketContainer packet = event.getPacket();
                    List<Sound> sounds = packet.getSoundEffects().getValues();
                    if (sounds.contains(Sound.ENTITY_PLAYER_ATTACK_STRONG) ||
                            sounds.contains(Sound.ENTITY_PLAYER_ATTACK_SWEEP) ||
                            sounds.contains(Sound.ENTITY_PLAYER_ATTACK_NODAMAGE) ||
                            sounds.contains(Sound.ENTITY_PLAYER_ATTACK_KNOCKBACK) ||
                            sounds.contains(Sound.ENTITY_PLAYER_ATTACK_CRIT) ||
                            sounds.contains(Sound.ENTITY_PLAYER_ATTACK_WEAK) ||
                            sounds.contains(Sound.ENTITY_PLAYER_HURT)) {
                        event.setCancelled(true);
                    }


                }
            }
        });

    }




}
