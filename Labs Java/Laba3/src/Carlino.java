import java.util.Arrays;

public class Carlino extends Dog {
    Carlino(String name, String color, String[] commands){
        this.name = name;
        this.color = color;
        this.commands = commands;
        ugliness = "Little bit ugly";
        loudness = 10;
    }

    @Override
    public String feed(String food){
        if(Arrays.asList(ratio).contains(food)) return "Gimme more";
        else return "LET ME EAT";
    }
}
