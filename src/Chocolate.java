/**
 * @class: Chocolate
 * @author: Max Painter
 * @written: January 26, 2023
 * description: Write a program to compute the number of
 * bags you will need to add three chocolates instead of two chocolates.
 */
public class Chocolate {
    public static void main(String[] args) {
        int bags = 9; //number of chocolate bags
        int bars = 2;// each bag has 2 chocolate bars

        System.out.println("There is "+ bags*bars +" chocolates in total."); //take all the chocolates out of each bag
        System.out.println("You will need "+ (bags*bars)/3 +" bags."); //add three chocolate bars to each bag
    }
}
