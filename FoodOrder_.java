/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorder_;

/**
 *
 * @author ASUS
 */
import static foodorder_.FoodOrder_.Bill;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FoodOrder_ {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String User,Pass;
    
        System.out.print("Enter username:");
        User = input.nextLine();
        System.out.print("Enter password:");
        Pass = input.nextLine();
        
        if(User.equals("admin")&&(Pass.equals("admin"))){
            System.out.println("You have successfuly loggined");
        }
        else{
            do {                
                System.out.println("Incorect Credentials");
                System.out.print("Enter username:");
                User = input.nextLine();
                System.out.print("Enter password:");
                Pass = input.nextLine();
            } while ((User.equals("admin") != true) && (Pass.equals("admin") != true));
        }
        
        menu();
        order();
        Bill();
        
     }
public static Scanner input = new Scanner (System.in);
    public static String again;
    public static int choose, quantity = 1;
    public static double total = 0;
 
    public static void menu(){
    
        System.out.println("\t+=========================================================================================================================================================+");
        System.out.println("\t|                MEALS               |                SANDWICH                    |                DRINKS             |              DESSERTS             |");
        System.out.println("\t|=========================================================================================================================================================|");
        System.out.println("\t|    1.Fried Chicken     Php.25.00   |   5.Beef Sandwich             Php.20.00    |  9. Coke Mismo       Php.18.00    |  13. Mango Float     Php.30.00    |");
        System.out.println("\t|    2.Pork Adobo        Php.30.00   |   6.Grilled Cheese Sandwich   Php.25.00    |  10.Lemonade Juice   Php.20.00    |  14. Macaronni       Php.35.00    |");
        System.out.println("\t|    3.Sinuglaw          Php.25.00   |   7.Cheese Sandwich           Php.25.00    |  11.Sprite Mismo     Php.18.00    |  15. Spaghetti       Php.25.00    |");
        System.out.println("\t|    4.Bulalo            Php.20.00   |   8.Ham & Cheese Sandwich     Php.20.00    |  12.Buko Juice       Php.20.00    |  16. Maja            Php.25.00    |");
        System.out.println("\t|=========================================================================================================================================================|");
        System.out.println("\t|                                                             17.CANCEL THE ORDER                                                                         |");
        System.out.println("\t+=========================================================================================================================================================+");
    }
 
  
    public static void order(){
        System.out.println("Press the number of food you want to buy : ");
        choose = input.nextInt();
        
        if(choose == 1){
            System.out.println("You choose Fried Chicken");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*25);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 2){
            System.out.println("You choose Pork Adobo");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*30);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 3){
            System.out.println("You choose Sinuglaw");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*25);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 4){
            System.out.println("You choose Bulalo");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*20);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 5){
            System.out.println("You choose Beef Sandwich");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*20);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 6){
            System.out.println("You choose Grilled Cheese Sandwich");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*25);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 7){
            System.out.println("You choose Cheese Sandwich");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*25);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 8){
            System.out.println("You choose Ham & Cheese Sandwich");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*20);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
       else if(choose == 9){
            System.out.println("You choose Coke Mismo");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*18);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
       else if(choose == 10){
            System.out.println("You choose Lemonade Juice");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*20);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
       else if(choose == 11){
            System.out.println("You choose Sprite Mismo");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*18);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
       else if(choose == 12){
            System.out.println("You choose Buko Juice");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*20);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
       else if(choose == 13){
            System.out.println("You choose Mango Float");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*30);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: :" + total);
            }
        }
        if(choose == 14){
            System.out.println("You choose Macaronni");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*35);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose == 15){
            System.out.println("You choose Grilled Cheese Sandwich");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*25);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : ");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is:  " + total);
            }
        }
        else if(choose == 16){
            System.out.println("You choose Maja");
            System.out.println("Quantity : ");
            quantity = input.nextInt();
            total = total + (quantity*25);
            
            System.out.println("You want to buy again? :");
            System.out.println("Press Y for Yes and N for No : $");
            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                order(); 
            }else{
                System.out.println("Total price is: " + total);
            }
        }
        else if(choose==17){
            System.exit(0);
        }
    }
    public static void Bill()
    {
    
        try(Scanner scanner = new Scanner(System.in)){
            
       
        double mealcost;
        double Tax;
        double totalcost;
        double totalprice;
    DecimalFormat df = new DecimalFormat(".00");   
         System.out.println("Cost of meal:");
         mealcost = scanner.nextDouble();
         Tax = 0.0256 * mealcost;
         totalcost = mealcost + Tax;
         totalprice = totalcost + Tax;
  
    System.out.println("Cost of meal: "+mealcost);
    
    System.out.println("Tax: "+df.format(Tax));
    
    System.out.println("Total Price:"+df.format(totalprice) );
    
 
    
   
     
             
    
    
    }
    }
  
    
 
}


