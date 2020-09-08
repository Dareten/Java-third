import java.util.ArrayList;
import java.util.stream.IntStream;

public class NotSoArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1, 3);
        for(int i=4;i<200;++i) if(isPrime(i)) list.add(i);
        System.out.println("В списке хранится " + list.size() + " простых чисел");
        System.out.println("25 простое число равняется " + list.get(25));
        if(list.contains(79)) System.out.println("Простое число 79 является " + (list.indexOf(79) + 1) + " в списке");
    }
    public static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }
}
