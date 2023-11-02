package de.marius_heinen.bot.pnp.discord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.marius_heinen.bot.pnp.discord.beans.DiscordProperties;
import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;

@Component
public class DiscordStarter {
    
    private DiscordProperties discordProperties;

    @Autowired
    public DiscordStarter(DiscordProperties discordProperties) {
        this.discordProperties = discordProperties;

        final GatewayDiscordClient client = DiscordClientBuilder.create(this.discordProperties.getToken())
                                                                .build()    
                                                                .login()    
                                                                .block();
        client.onDisconnect().block();
    }    
}
