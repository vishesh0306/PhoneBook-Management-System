import java.util.Iterator;

public class Operations {

    // private static boolean startOperations;

    public static Contact addContact(String name, long phoneNo){
        Contact con = new Contact(name, phoneNo);

        // if(DataBase.contactCount < DataBase.contacts.size()){
            // DataBase.contacts[DataBase.contactCount] = con;
            DataBase.contacts.add(con);
            DataBase.contactCount++;

            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Contact added successfully!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // }
        // else{
        //     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //     System.out.println("Can't add new contact, memory is full!");
        //     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // }

        System.out.println();
        System.out.println();

        return con;
    }

    public static void addContact(String name, long phoneNo, String email){
        Contact con = new Contact(name, phoneNo, email);

        // if(DataBase.contactCount < DataBase.contacts.length){
            // DataBase.contacts[DataBase.contactCount] = con;
            DataBase.contacts.add(con);
            DataBase.contactCount++;

            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Contact added successfully!!");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println();

        // }
        // else{
        //     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //     System.out.println("Can't add new contact, memory is full!");
        //     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //     System.out.println();
        //     System.out.println();

        // }

        
    }



    public static int searchByName(String name){
        for(int i = 0; i < DataBase.contacts.size(); i++){
            if(DataBase.contacts.get(i) != null){
                if(DataBase.contacts.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                    return i;
                    // return DataBase.contacts[i].getPhoneNo();
                }
            }
        }
        return -1;
    }

    public static void printDetails(String name){
        boolean flag = false;
        for(int i = 0; i < DataBase.contacts.size(); i++){
            if(DataBase.contacts.get(i) != null){
                if(DataBase.contacts.get(i).getName().toLowerCase().startsWith(name.toLowerCase())){
                    if (!flag) {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Contact Found!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");            
                    }
                    flag = true;
                    Contact con = DataBase.contacts.get(i);
                    String email = con.getEmail()!= null ? con.getEmail() : "-";
                    System.out.println("Name: " + con.getName() + "     " + "Phone No.: " + con.getPhoneNo()  + "     " + "Email: " + email);
                    
                }
            }
        }
        if(!flag){
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Contact name "+ name + " not found in contacts");

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println();
            System.out.println();
    }

    public static int searchByPhoneNumber(long phoneNo){


        for(int i = 0; i < DataBase.contactCount; i++){
            if(DataBase.contacts.get(i) != null){
                if(DataBase.contacts.get(i).getPhoneNo() == phoneNo){
                    return i;
                    // return phoneNo + " is of : " + DataBase.contacts[i].getName();
                }
            }
        }
        return -1;
        // return "Contact not found";
    }

    public static void serchedDetails(String name){
        // int nameIndex = searchByName(name);
        printDetails(name);

    }



    public static void printDetailsByName(String name){
        int nameIndex = searchByName(name);

        if(nameIndex != -1){
            Contact con = DataBase.contacts.get(nameIndex);
            String email = con.getEmail()!= null ? con.getEmail() : "-";

            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Contact Found!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");            

            System.out.println("Name: " + con.getName() + "     " + "Phone No.: " + con.getPhoneNo()  + "     " + "Email: " + email);

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Contact name "+ name + " not found in contacts");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.println();
            System.out.println();
        }
    }

    public static void printDetailsByPhoneNumber(long phoneNo){
        int nameIndex = searchByPhoneNumber(phoneNo);

        if(nameIndex != -1){
            Contact con = DataBase.contacts.get(nameIndex);
            String email = con.getEmail()!= null ? con.getEmail() : "-";

            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Contact Found!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  

            System.out.println("Name: " + con.getName() + "     " + "Phone No.: " + con.getPhoneNo()  + "     " + "Email: " + email);

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Contact number "+ phoneNo + " not found in contacts");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println();
        }
    }



    public static void getAllContacts(){

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ALL CONTACTS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        if(DataBase.contacts.size() == 0){
            System.out.println("Empty Contact List");
            System.out.println();
        }
        
        for(int i = 0; i < DataBase.contacts.size(); i++){
            Contact con = DataBase.contacts.get(i);
            if(con != null){
                String email = con.getEmail()!= null ? con.getEmail() : "-";
                System.out.println("Name: " + con.getName() + "     " + "Phone No.: " + con.getPhoneNo()  + "     " + "Email: " + email);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println();
    }



    public static void editName(String oldName, String newName){
        int nameIndex = searchByName(oldName.toLowerCase());
        if(nameIndex != -1){
            DataBase.contacts.get(nameIndex).setName(newName);
            System.out.println();

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact list edited!! Contact name " + oldName + " changed to " + newName);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
             System.out.println("Contact "+ oldName + " not found in contacts");
             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
             System.out.println();
        }
    }

    public static void editPhoneNumber(long oldPhoneNo, long newPhoneNo){
        int phoneIndex = searchByPhoneNumber(oldPhoneNo);
        if(phoneIndex != -1){
            DataBase.contacts.get(phoneIndex).setPhoneNo(newPhoneNo);
            System.out.println();

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact list updated!! " + oldPhoneNo + " changed to " + newPhoneNo);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact number " + oldPhoneNo + " not found in contacts");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();
        }
    }



    public static void deleteContact(String name){
        int nameIndex = searchByName(name.toLowerCase());
        if(nameIndex != -1){
            // DataBase.contacts[nameIndex] = null;
            DataBase.contacts.remove(nameIndex);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact " + name + " deleted successfully");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact " + name + " not found in contacts");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();
        }
    }
    
    public static void deleteContact(long phoneNo){
        int phoneIndex = searchByPhoneNumber(phoneNo);
        if(phoneIndex != -1){
            // DataBase.contacts[phoneIndex] = null;
            DataBase.contacts.remove(phoneIndex);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact " + phoneNo + " deleted successfully");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();
        }
        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("Contact " + phoneNo + " not found in contacts");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println();
            System.out.println();

        }
    }



    public static void call(long phoneNo){
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
        System.out.println("\t\t\t Calling  " + phoneNo);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 


        int nameIndex = searchByPhoneNumber(phoneNo);
        if(nameIndex != -1){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("\t\t\t Calling  " + phoneNo);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            DataBase.callLogs.add(DataBase.contacts.get(nameIndex));
            DataBase.callLogsCount++;
        }

        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("\t\t\t Contact not found");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            
        }
    }

    public static void call(String name){
        int nameIndex = searchByName(name.toLowerCase());
        if(nameIndex != -1){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("\t\t\t Calling  " + name);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            DataBase.callLogs.add( DataBase.contacts.get(nameIndex));
            DataBase.callLogsCount++;
        }

        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("\t\t\t Contact not found");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
        }
    }
    

    public static void printCallHistory(){

        int callCount = DataBase.callLogsCount;

        if(callCount == 0){
            
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
            System.out.println("\t\t\t No Call Logs");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
        }
        else{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 

            Iterator<Contact> itr = DataBase.callLogs.iterator();
            while (itr.hasNext()) {
                Contact con = itr.next();
                System.out.println("Name: " + con.getName()+ "\tPhone number: " + con.getPhoneNo());
            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
        }
    }



    public static void addFavourite(String name){
        int nameIndex = searchByName(name);

        if(nameIndex != -1){
            DataBase.favContacts.add(DataBase.contacts.get(nameIndex));
        }
    }


    public static boolean begin(){
        // startOperations = true;
        return true;
    }

    public static boolean end(){
        // startOperations = false;
        return false;
    }


}