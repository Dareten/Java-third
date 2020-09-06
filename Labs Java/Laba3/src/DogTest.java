public class DogTest {
    public static void main(String[] args){
        Carlino doggy1 = new Carlino("Ada", "NACHT", new String[]{"eat", "sleep"});
        Pembroke doggy2 = new Pembroke("Borr", "almost white", new String[]{"Sit", "down", "heel", "come", "stay"});
        doggy1.setRatio(new String[]{"everything"});
        doggy2.setRatio(new String[]{"fruits", "vegetables", "milk"});
        System.out.println("Carlino " + doggy1.name + " can eat " + doggy1.ratio[0] +
                " and know " + doggy1.commands.length + " commands!");
        System.out.println("Pembroke " + doggy2.name + " with " +
                doggy2.color + " color know many commands such as " + doggy2.commands[3] + " and " + doggy2.commands[1]);
    }
}
