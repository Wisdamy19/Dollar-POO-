package Secao08.DollarPOO;

import java.util.Scanner;
import java.util.Locale;

public class Dollar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DollarMembers dollarMembers = new DollarMembers();
        System.out.println("What is the dollar price?");
        dollarMembers.dollar = scan.nextDouble();
        System.out.println("How many dollars will be bought?");
        dollarMembers.quantity = scan.nextDouble();

        System.out.println(dollarMembers);


    }
}
