import java.util.Scanner;

public class SaberaPrim {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);
String s;

System.out.printf("Introduza um nome para saber a primeira letra: ");
s = in.nextLine();

System.out.println(s.substring(0, 1));
}
}