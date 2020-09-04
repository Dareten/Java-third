import java.util.ArrayDeque;
import java.util.Scanner;

public class Drunkard {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> foo = new ArrayDeque<>();
        ArrayDeque<Integer> bar = new ArrayDeque<>();
        for(int a=0;a<2;++a){
            for(int b=0;b<5;++b){
                if(a == 0) foo.push(scan.nextInt());
                else bar.push(scan.nextInt());
            }
        }
        int a, b;
        for(int i=0;i<106;++i){
            a = foo.pollLast();
            b = bar.pollLast();
            if((a == 0 && b == 9) || (a > b && !(a == 9 && b == 0))){
                foo.addFirst(a);
                foo.addFirst(b);
            }else{
                bar.addFirst(a);
                bar.addFirst(b);
            }
            if(foo.isEmpty()){
                System.out.println("second " + (i + 1));
                return;
            }else if(bar.isEmpty()){
                System.out.println("first " + (i + 1));
                return;
            }
        }
        System.out.println("botva");
    }
}
