package day11and12Practice;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
    java.util.Scanner Scanner = new Scanner(System.in);
    System.out.print("Enter no of  stocks: ");
    int stock_no = Scanner.nextInt();

    String[] stock_name = new String[stock_no];
    int[] share_no = new int[stock_no];
    double[] share_price = new double[stock_no];
    double[] total_share_price = new double[stock_no];
    double total_stock_price = 0;

    for (int i = 0; i < stock_no; i++) {
        System.out.println("Enter stock name:");
        stock_name[i] = Scanner.next();

        System.out.println("Enter share no:");
        share_no[i] = Scanner.nextInt();

        System.out.println("Enter share Price :");
        share_price[i] = Scanner.nextDouble();

        total_share_price[i] = share_no[i] * share_price[i];

        total_stock_price = total_stock_price + total_share_price[i];
    }

    System.out.println("Stock Report:");
    for (int i = 0; i < stock_no; i++) {
        System.out.println(stock_name[i] + "  " + share_no[i] + " " + share_price[i] + " " + total_share_price[i]);
    }
    System.out.println("Total Stock Price: $ " + total_stock_price);

}
}
