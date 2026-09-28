import java.util.Scanner;
public class Parcelweight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter weight");
            double weight = sc.nextDouble();
            if(weight <= 50) {
            System.out.println("Weight accepted:" + weight + "kg");}
            else {
            System.out.println("Invalid weight." + "Please enter a number."); }
        }        /*finally {
            System.out.println("Weight checking completed.");
        }*/
       sc.close();
    }

