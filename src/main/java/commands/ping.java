package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ping extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        EmbedBuilder eb = new EmbedBuilder();
        String msg = e.getMessage().getContentRaw();
        if ((!e.getAuthor().isBot()) && msg.equals("!ping")) {
            long ping = e.getJDA().getPing();
            eb.addField("Pong!", ping + "ms", false);
            e.getChannel().sendMessage(eb.build()).queue();
        }
    }
}
