import commands.eaglewoke;
import commands.help;
import commands.ping;
import commands.tomato;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception{
        JDA jda = new JDABuilder("NTg1NDExMDEzMDEzMjc0NjM3.XQVdpA.2LjtTWv3nIando3UoNltI3tYjZs").build();
        jda.addEventListener(new ping());
        jda.addEventListener(new help());
        jda.addEventListener(new eaglewoke());
        jda.addEventListener(new tomato());
    }
}
