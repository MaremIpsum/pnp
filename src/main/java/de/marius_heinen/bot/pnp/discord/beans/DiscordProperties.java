package de.marius_heinen.bot.pnp.discord.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiscordProperties {
    @Value("${discord.token}")
    private String token;

    public String getToken() {
        return this.token;
    }
}
