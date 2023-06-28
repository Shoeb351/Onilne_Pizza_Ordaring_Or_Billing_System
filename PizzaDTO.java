package PizaaBill;

import java.util.Scanner;

public class PizzaDTO {

 PizzaDAO p1=new PizzaDAO();


 public void BillCalculator(){
     System.out.println("=======* BILL *=======");
     double price=p1.getPrice();
     System.out.println( "Price = "+price);
     int charges=40;
     double total=charges+price;
     System.out.println("Delivery Charges = 40 RS");
     System.out.println("Total Amount =" +total);
     System.out.println("====== THANK YOU   ======");
     System.out.println("====== Visit Again ======");
     System.out.println("--------------------------");

 }

    Scanner sc=new Scanner(System.in);
    public void Userinfo(){
        System.out.println("Enter User Name");
        String name=sc.next();
        System.out.println("Enter Contact Number");
        long cno=sc.nextLong();
        System.out.println("--------------------------");
        MenuOption();
    }

    public void MenuOption(){
        System.out.println("Enter  The Choice \n1.Veg \n2.Non Veg");

        int choice=sc.nextInt();
        System.out.println("--------------------------");
        switch (choice){
            case 1:{
                Veg();
            }
            break;
            case 2:{
                NOnVeg();
            }
            break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public void Veg() {
            System.out.println("Enter The Choice \n1. Cheese n Corn Pizza = 309 \n2.Fresh veggie Pizza = 339 \n3.Paneer Tandoori Pizza = 459 \n4.Delux Veg Pizza = 480 ");
             int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("--------------------------");
                    System.out.println("Cheese n Corn Pizza");
                    p1.setPrice(309);
                    BillCalculator();
                }
                break;
                case 2:{
                    System.out.println("--------------------------");
                    System.out.println("Fresh veggie Pizza");
                    p1.setPrice(339);
                    BillCalculator();

                }
                break;
                case 3:{
                    System.out.println("--------------------------");
                    System.out.println("Paneer Tandoori Pizza");
                    p1.setPrice(359);
                    BillCalculator();
                }
                break;
                case 4:{
                    System.out.println("--------------------------");
                    System.out.println("Delux Veg Pizza");
                    p1.setPrice(480);
                    BillCalculator();
                }
                break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

    public void NOnVeg(){
        System.out.println("Enter the Choice  \n1.Checken Dominator = 599 RS \n2.Checken Golden Delight = 620 Rs \n3. Spiced Double Checken = 559 Rs \n4.The 5 Checken Feast Pizza = 699 Rs \n5.Checken Maximus = 580 Rs");
        int choice =sc.nextInt();
        switch ( choice){
            case 1:{
                System.out.println("--------------------------");
                System.out.println("Checken Dominator");
                p1.setPrice(599);
                BillCalculator();
            }
            break;
            case 2:{
                System.out.println("--------------------------");
                System.out.println("Checken Golden Delight");
                p1.setPrice(620);
                BillCalculator();
            }
            break;
            case 3:{
                System.out.println("--------------------------");
                System.out.println("Spiced Double Checken");
                p1.setPrice(559);
                BillCalculator();
            }
            break;
            case 4:{
                System.out.println("--------------------------");
                System.out.println("The 5 Checken Feast Pizza");
                p1.setPrice(699);
                BillCalculator();
            }
            break;
            case 5:{
                System.out.println("--------------------------");
                System.out.println("Checken Maximus");
                p1.setPrice(580);
                BillCalculator();
            }
            break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
