import java.util.*;


public class knapsack{

    /*
     * We are given some objects and their values
     * 
     * We want to solve this using Dynamic Programming with
     * a bottom up approach.  Additionally, we want to use memoization
     * 
     * 
     */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number of items to compare");
        Integer numItems = scan.nextInt();
        System.out.println("Please enter a number to set knapsack capacity");
        Integer capacity = scan.nextInt();
        System.out.println(capacity);

        Integer[][] arr = new Integer[numItems][capacity];
        System.out.println(arr);

    scan.close();
    }
}