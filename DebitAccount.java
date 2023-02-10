package day11and12Practice;

import java.util.Scanner;

public class DebitAccount {
    public static int saving_balance;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance amount in account : ");
        saving_balance = sc.nextInt();

        DebitAccount.debit(9000);
    }

    public static void  debit(int withDraw) {
        System.out.println("Withdraw balance: " +withDraw);
        if (withDraw > saving_balance) {
            System.out.println("Insufficient balance in Savings Account");

        }
        else {
            saving_balance = saving_balance - withDraw;
            System.out.println("After withdraw then Saving Balance: " +saving_balance);
        }


    }
}
