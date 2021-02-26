import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faith
 */
public class cadECE_restaurant {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("     ......................................      ");
        System.out.println("     .     Welcome to cadECE fastfood     .      ");
        System.out.println("     .          Here is our menu          .      ");
        System.out.println("     . 1. Fried Chicken w/ rice...P60.00  .      ");
        System.out.println("     . 2. Spaghetti...............P50.00  .      ");
        System.out.println("     . 3. Burger..................P30.00  .      ");
        System.out.println("     . 4. Fries...................P30.00  .      ");
        System.out.println("     . 5. Ice cream Sundae........P20.00  .      ");
        System.out.println("     ......................................      ");
        System.out.println("          May I take your order please           ");
        System.out.println("    note: the application will ask the number    ");
        System.out.println("of order you want per menu in chronological order");
        System.out.println(".................................................");
        System.out.println("How many order of Fried Chicken w/ rice do you want?");
        int a = input.nextInt();
        System.out.println("How many order of Spaghetti do you want?");
        int b = input.nextInt();
        System.out.println("How many order of Burger do you want?");
        int c = input.nextInt();
        System.out.println("How many order of Fries do you want?");
        int d = input.nextInt();
        System.out.println("How many order of Ice cream Sundae do you want?");
        int e = input.nextInt();
        
        System.out.println("......................................");
        System.out.println("      Here is your total orders       ");
        System.out.println("  Fried chicken: " + a);
        System.out.println("  Spaghetti: " + b);
        System.out.println("  Burger: " + c);
        System.out.println("  Fries: " + d);
        System.out.println("  Ice cream sundae: " + a);
        double PartialTotal = (60*a)+(50*b)+(30*c)+(30*d)+(20*e);
        System.out.println("  TOTAL: P" + PartialTotal);
        System.out.println("  Because it is our Opening Day");
        System.out.print("  And you bought P"+PartialTotal);
        System.out.println(" worth of order");
        
        if (PartialTotal <= 500){
        System.out.println("  You will receive a 10% discount");
        double DiscountedTotal = PartialTotal - (PartialTotal*0.10) ;
        System.out.println("  You will only pay P" + DiscountedTotal);
        System.out.println("......................................");
        System.out.println("Please enter your payment");
        double f = input.nextInt();
        System.out.println("......................................");
        System.out.println("We received: P"+f);
        System.out.println("Your change is P"+ (f-DiscountedTotal));
        System.out.println("Thank you for ordering :)!"); }
        
        else if(PartialTotal>=500){
        System.out.println("  You will receive a 20% discount");
        double DiscountedTotal = PartialTotal - (PartialTotal*0.20) ;
        System.out.println("  You will only pay P" + DiscountedTotal);
        System.out.println("......................................");
        System.out.println("Please enter your payment");
        double f = input.nextInt();
        System.out.println("......................................");
        System.out.println("We received: P"+f);
        System.out.println("Your change is P"+ (f-DiscountedTotal));
        System.out.println("Thank you for ordering :)!"); } 
    }
        
 }
       
        
    

