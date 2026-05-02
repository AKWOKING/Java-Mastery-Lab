/**
 * program that  reads 5 integers and determines and prints the largest and smallest integers in the group
 */

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] num = new int[5]; // array of size 5

        // integers from users
        for(int i=0; i<5; i++){
            System.out.println("Enter integer " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }

        sc.close();
    }
}