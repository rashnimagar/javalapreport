package ArrayStringControlStatements;

import java.util.Scanner;
public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=5; i++){
            System.out.println("Enter string " +i+ " to append: ");
            sb.append(sc.nextLine());
            sb.append(" ");
        }
        System.out.println("The final concatenated string is: ");
        System.out.println(sb);
        sc.close();
    }
}
