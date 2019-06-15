package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class help extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        EmbedBuilder eb = new EmbedBuilder();
        String msg = e.getMessage().getContentRaw();
        if ((!e.getAuthor().isBot()) && msg.equals("!help")) {
            eb.setTitle("!help");
            eb.addField("Commands", "!eaglewoke, !help, !ping, !tomato", false);
            e.getChannel().sendMessage(eb.build()).queue();
        }
    }
}
