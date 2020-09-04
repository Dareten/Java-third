import java.util.Scanner;

public class Problems {
    public static void main(String[] args){
        System.out.println(palindrome("sdqwer"));
        System.out.println(palindrome("sdqwerewqds"));
        System.out.println(zeros(10, 15));
        System.out.println(reverse(123456987, 0));
        System.out.println(ones());
        odds();
    }
    public static String palindrome(String s){
        if(s.length() < 2){
            return "YES";
        }else{
            char[] c = s.toCharArray();
            if(c[0] != c[c.length - 1]){
                return "NO";
            }else{
                return palindrome(s.substring(1, c.length - 1));
            }
        }
    }
    public static int zeros(int a, int b){
        if(a > b + 1) return 0;
        if(a == 0 || b == 0) return 1;
        if(a == 1) return b + 1;
        return zeros(a - 1, b - 1) + zeros(a, b - 1);
    }
    public static long reverse(long n, long x){
        return (n == 0) ? x : reverse(n / 10, x * 10 + n % 10);
    }
    public static int ones(){
        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() == 1) {
            if (scan.nextInt() == 1) return ones() + 2;
            else{
                if (scan.nextInt() == 1) return ones() + 2;
                else return 1;
            }
        }else{
            if (scan.nextInt() == 1) return ones() + 1;
            else return 0;
        }
    }
    public static void odds(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            if (n % 2 == 1) System.out.println(n);
            odds();
        }
    }
}
