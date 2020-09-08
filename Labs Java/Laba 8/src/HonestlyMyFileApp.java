import java.io.*;
import java.util.Scanner;

public class HonestlyMyFileApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(FileWriter writer = new
                FileWriter("237.txt", true)) {
            writer.write(scan.nextLine());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}