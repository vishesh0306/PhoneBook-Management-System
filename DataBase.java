import java.util.ArrayList;

public class DataBase {
    
    // public static Contact[] contacts = new Contact[10];
    public static ArrayList<Contact> contacts = new ArrayList<>();
    
    // public static Contact[] callLogs = new Contact[10];
    public static ArrayList<Contact> callLogs = new ArrayList<>();
    
    // public static Contact[] blockedContacts = new Contact[10];
    public static ArrayList<Contact> blockedContacts = new ArrayList<>();

    public static ArrayList<Contact> favContacts = new ArrayList<>();
    
    static int contactCount = 2;
    static int callLogsCount = 0;
    static int blockedContactsCount = 0;
    static int favContactsCount = 0;

    static{
        contacts.add(new Contact("ABC", 7656798887L));
        contacts.add(new Contact("DEF", 9876556789L, "kshitiz@gmail.com"));
        // contacts[0] = new Contact("ABC", 7656798887L);
        // contacts[1] = new Contact("DEF", 9876556789L, "kshitiz@gmail.com");
    }


}
