public abstract class Dog {
    protected int loudness;
    protected String name;
    protected String ugliness;
    protected String color;
    protected String[] commands;
    protected String[] ratio;

    public int getLoudness() {
        return loudness;
    }
    public void setLoudness(int loudness) {
        this.loudness = loudness;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUgliness() {
        return ugliness;
    }
    public void setUgliness(String ugliness) {
        this.ugliness = ugliness;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String[] getCommands() {
        return commands;
    }
    public void setCommands(String[] commands) {
        this.commands = commands;
    }
    public boolean isCute(){
        return getUgliness().toLowerCase().contains("cute");
    }
    public String[] getRatio() {
        return ratio;
    }
    public void setRatio(String[] ratio) {
        this.ratio = ratio;
    }
    public boolean isGoodBoy(){
        return commands.length > 3;
    }
    public abstract String feed(String food);
}
