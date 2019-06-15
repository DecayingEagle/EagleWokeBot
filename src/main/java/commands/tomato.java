package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class tomato extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder();
        String msg = e.getMessage().getContentRaw();
        if ((!e.getAuthor().isBot()) && msg.equals("!tomato")) {
            e.getChannel().sendMessage("<@109738696768516096> is my senpai xd").queue();
        }
    }
}
