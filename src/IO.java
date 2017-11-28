import java.util.Scanner;

public class IO {

    public String input(String text){
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
