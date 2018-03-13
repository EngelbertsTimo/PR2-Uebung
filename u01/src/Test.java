import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Wie lautet ihr Name? ");
        String name = console.nextLine();
        System.out.print("Wie lautet Ihre Matrikelnummer? ");
        String matnr= console.nextLine();
        System.out.println(name + "(" + matnr + ")");
    }
}