import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Laba1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        first();
        second(args);
        third();
        fourth();
        fifth(scan.nextInt());
    }

    public static void first() {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int c = 0;
        for (int i : arr) c += i;
        System.out.println(c);
        c = 0;
        int i = -1;
        while (i < arr.length - 1) c += arr[++i];
        System.out.println(c);
        c = 0;
        i = 0;
        do c += arr[i++];
        while (i != arr.length);
        System.out.println(c);
    }

    public static void second(String[] args) {
        for (String s : args) System.out.print(s + " ");
        System.out.println();
    }

    public static void third() {
        for (int i = 1; i < 11; ++i) System.out.print(1. / i + " ");
        System.out.println();
    }

    public static void fourth() {
        Random random = new Random(System.currentTimeMillis());
        int[] arr = new int[10];
        for(int i=0;i<arr.length;++i){
            arr[i] = random.nextInt();
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i: arr) System.out.print(i + " ");
    }

    public static void fifth(int n) {
        long fact = 1;
        for (int i=2;i<=n;++i) fact *= i;
        System.out.println(fact);
        System.out.println(LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y));
    }
}