import java.util.Scanner;

public class App {
    
    Contact[] conList = DataBase.contacts;
    int conCount = DataBase.contactCount;

    static{
        System.out.println("==========================================================");
        System.out.println("\t\tWelcome to Phone Book");
        System.out.println("==========================================================");
        System.out.println();

    }

    public static void main(String[] args) {
        
        boolean flag = Operations.begin();
        int operationInput;
        int choice1;
        String name;
        long phoneNo;
        Scanner scanner = new Scanner(System.in);

        while(flag){

            System.out.println("Press the numbers 1,2,3,4,5,6 to perform the following operations: ");
            System.out.println();
            System.out.println("  1: Add a new contact \n  2: Search for a contact in PhoneBook \n  3: Edit a contact in PhoneBook \n  4: Delete a contact in PhoneBook \n  5: Display all contacts in the PhoneBook \n  6: Call an existing contact \n  7: Print call history  \n  8: Exit from PhoneBook");
            
            System.out.println();
            System.out.print("Enter your choice: ");
            operationInput = scanner.nextInt();
            System.out.println();

            switch (operationInput) {
                case 1:{
                    System.out.print("Enter Name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();

                    
                    System.out.print("Enter Phone Number: ");
                    phoneNo = scanner.nextLong();
                    
                    
                    System.out.print("Enter Email Address: (not necessary)");
                    scanner.nextLine();
                    String email = scanner.nextLine();


                    if(email == ""){
                        Operations.addContact(name, phoneNo);
                    }
                    else{
                        Operations.addContact(name, phoneNo, email);
                    }

                    break;
                }

                case 2:{

                    System.out.println("Wanna search by name or phoneNumber? ");
                    System.out.println("  Press 1: Search by contact name \n  Press 2: Search by Phone Number");

                    System.out.println();
                    System.out.print("Enter your choice: ");
                    choice1 = scanner.nextInt();
                    System.out.println();

                    switch (choice1) {
                        case 1: {

                            System.out.print("Enter name: ");
                            scanner.nextLine();
                            name = scanner.nextLine();
                            
                            System.out.println();
                            Operations.printDetailsByName(name);
                            System.out.println();

                            break;
                            
                        }

                        case 2: {

                            System.out.print("Enter Phone Number: ");
                            scanner.nextLine();
                            phoneNo = scanner.nextLong();

                            Operations.printDetailsByPhoneNumber(phoneNo);
                            System.out.println();

                            break; 
                        }

                        default: {
                            System.out.println("Incorrect choice input");
                            break;
                        }
                    }

                    break;
                }

                case 3: {

                    System.out.println("Wanna edit name or phoneNumber? ");
                    System.out.println("  Press 1: Edit contact name \n  Press 2: Edit Phone Number");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    choice1 = scanner.nextInt();
                    System.out.println();

                    switch (choice1) {
                        case 1:{
                            scanner.nextLine();
                            System.out.print("Enter name to change: ");
                            String oldName = scanner.nextLine();
                            
                            System.out.print("Enter new Name: ");
                            String newName = scanner.nextLine();

                            Operations.editName(oldName, newName);

                            break;
                        }

                        case 2: {
                            scanner.nextLine();
                            System.out.print("Enter phone number to change: ");
                            long oldPhoneNo = scanner.nextLong();
                            
                            System.out.print("Enter new Phone number: ");
                            long newPhoneNo = scanner.nextLong();

                            Operations.editPhoneNumber(oldPhoneNo, newPhoneNo);
                            
                            break;
                        }
                    
                        default:{
                            System.out.println("Incorrect choice input");
                        } break;
                    }

                    break;
                }


                case 4:{
                    System.out.print("Enter contact name or contact phone number to detete ");
                    scanner.nextLine();

                    System.out.println();

                    String input = scanner.nextLine();

                    try {
                        long number = Long.parseLong(input);
                        Operations.deleteContact(number);

                    } 
                    catch (NumberFormatException e) {
                        Operations.deleteContact(input);
                    }

                    
                    break;
                }
               
               
                case 5:{
                    Operations.getAllContacts();
                    break;
                }


                case 6:{
                    System.out.print("Enter contact name or contact number to call: ");
                    scanner.nextLine();
                    // System.out.println();

                    String input = scanner.nextLine();

                    try {
                        long number = Long.parseLong(input);
                        Operations.call(number);
                        
                    } 
                    catch (NumberFormatException e) {
                        Operations.call(input);
                    }

                    
                    break;
                }

                case 7:{

                    System.out.println("\t\t\tCall History");
                    Operations.printCallHistory();

                    break;
                }


                case 8:{
                    System.out.println();
                    flag = Operations.end();
                    break;
                }

                default:
                    break;
            }
        }

        scanner.close();


    }


}
