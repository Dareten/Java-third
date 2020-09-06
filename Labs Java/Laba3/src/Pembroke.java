import java.util.Arrays;

public class Pembroke extends Dog {
    Pembroke(String name, String color, String[] commands){
        this.name = name;
        this.color = color;
        this.commands = commands;
        ugliness = "Very cute";
        loudness = 5;
    }

    @Override
    public String feed(String food){
        if(Arrays.asList(ratio).contains(food)) return "Mnom-monm";
        else return "Anyway i can steal it and run away";
    }
}
