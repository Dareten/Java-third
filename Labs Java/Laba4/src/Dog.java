public class Dog implements Nameable {
    private String name;
    private String color;
    private String ugliness;
    private int loudness;
    Dog(String name, String color){
        this.name = name;
        this.color = color;
        ugliness = "Very cute";
        loudness = 5;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
