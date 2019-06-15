package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class eaglewoke extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder();
        String msg = e.getMessage().getContentRaw();
        if ((!e.getAuthor().isBot()) && msg.equals("!eaglewoke")) {
            e.getChannel().sendMessage("placeholder").queue();
        }
    }
}
