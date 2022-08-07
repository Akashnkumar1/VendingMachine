import Machine.VendingMachine;
import Model.Machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine v1 = new VendingMachine();
        v1.addMachine("M1", "gurguam");
        v1.getMachine().addCustomer("akashnkumar1","Akash Kumar","akashnkumar1@gmail.com","Cash");
        v1.getMachine().getCustomer().addToCart("cash");
        v1.getMachine().getCustomer().getCart().addProduct("Vani-cola",120.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("cola",720.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("Vani",180.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("cola-coco",129.0,"the taste of akash");
        System.out.println(v1.getMachine().getCustomer().getCart().getTotalPrice());
        //v1.getMachine().getCustomer().getCart().getProduct();
        v1.getMachine().addCustomer("akshnkuar1","ash Kur","akaumar1@gmail.com","Card");
        v1.getMachine().getCustomer().addToCart("Card");
        v1.getMachine().getCustomer().getCart().addProduct("Vani-cola",720.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("cola",7.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("Vani",10.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("cola-coco",129.0,"the taste of akash");
        System.out.println(v1.getMachine().getCustomer().getUserName()+ " " + v1.getMachine().getCustomer().getCart().getTotalPrice());
        v1.addMachine("M1", "Patna");
        v1.getMachine().addCustomer("Vani1","Vani","vani@gmail.com","Card");
        v1.getMachine().getCustomer().addToCart("Card");
        v1.getMachine().getCustomer().getCart().addProduct("Vani-cola",120.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("cola",720.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("Vani",180.0,"the taste of akash");
        v1.getMachine().getCustomer().getCart().addProduct("cola-coco",129.0,"the taste of akash");
        System.out.println(v1.getMachine().getCustomer().getCart().getTotalPrice());
//        System.out.println("Welcome to the Vending Machine");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. Add a Vending Machine\n2. Select a Vending Machine");
//        int choice = sc.nextInt();
//        while(true){
//            VendingMachine v = new VendingMachine();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter Machine Name");
//                    String machine = sc.nextLine();
//                    System.out.println("Enter Your Location");
//                    String location = sc.nextLine();
//                    v.addMachine(machine, location);
//                    break;
//                case 2:
//                    System.out.println("Enter Machine Name");
//                    System.out.println("Machine Id : " + v.getMachine().getMachineID());
//                    System.out.println("Machine Name : " + v.getMachine().getMachineName());
//                    System.out.println("Machine Location : " + v.getMachine().getMachineLocation());
//                    break;
//                default:
//                    System.out.println("Please Enter a Valid Choice!!");
//            }
//        }

    }
}