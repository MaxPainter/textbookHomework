/**
 * @class: Stamps
 * @author: Max Painter
 * @written: January 26, 2023
 * description: Write a program named Cycle.java and compute the total number tricycles at the shop.
 */
public class Cycle {
    public static void main(String[] args) {
        int bi = 10;
        int biWheels = bi*2;// there are 2 wheels in a bicycle
        int totalWheels = 47;

        System.out.println("There is "+ (totalWheels-biWheels)/3 +" tricycles at the shop");

    }
}
