public class Testing {
    public static void main(String[] args) {

        System.out.println(DataBase.contacts[0]);
        System.out.println(DataBase.contacts[0].getName());
        System.out.println(DataBase.contacts[0].getEmail() != null ? DataBase.contacts[0].getEmail() : "Email not given");
        System.out.println(DataBase.contacts[0].getPhoneNo());

        Contact c2 = Operations.addContact("GHI", 9898765432L);
        System.out.println(c2.getName());
        System.out.println(c2.getEmail() != null ? c2.getEmail() : "Email not given");
        System.out.println(c2.getPhoneNo());


        Operations.addContact("JKL", 9898765432L, "bablu@gmail.com");
        // System.out.println(c3.getName());
        // System.out.println(c3.getEmail() != null ? c3.getEmail() : "Email not given");
        // System.out.println(c3.getPhoneNo());


        for(int i = 0; i < DataBase.contactCount; i++){
            System.out.println(DataBase.contacts[i].getName());
        }

        // Search by Name
        int nameIndex = Operations.searchByName("DEF");
        System.out.println(nameIndex != -1? "Contact found, Phone no: " + DataBase.contacts[nameIndex].getPhoneNo() : "Contact Not Found");

        // Search by PhoneNumber
        int contactIndex = Operations.searchByPhoneNumber(9898765432L);
        System.out.println(contactIndex != -1 ? "Contact found, Name: " + DataBase.contacts[contactIndex].getName() : "Contact Number not in contacts");

        System.out.println("======================================================================");
        Operations.getAllContacts();
        System.out.println("======================================================================");
        
        System.out.println("======================================================================");
        
        DataBase.contacts[0].setName("Sahil");
        DataBase.contacts[1].setName("Chuchu");
        DataBase.contacts[2].setName("Kshitiz");
        DataBase.contacts[3].setName("Vishesh");
        
        Operations.getAllContacts();
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        
        Operations.editName("chuchu", "Chuchiiii");
        
        Operations.getAllContacts();
        
        Operations.editPhoneNumber(9898765432L, 1231231233);
        
        System.out.println(DataBase.contacts[2].getPhoneNo());
        System.out.println(DataBase.contacts[1].getName());
        
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        Operations.deleteContact("kshitiz");
        Operations.deleteContact(7656798887L);
        Operations.getAllContacts();


    }
}