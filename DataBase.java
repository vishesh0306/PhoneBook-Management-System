public class DataBase {
    
    public static Contact[] contacts = new Contact[10];

    public static Contact[] callLogs = new Contact[10];

    public static Contact[] blockedContacts = new Contact[10];

    public static Contact[] favContacts = new Contact[10];
    
    static int contactCount = 2;
    static int callLogsCount = 0;
    static int blockedContactsCount = 0;
    static int favContactsCount = 0;

    static{
        contacts[0] = new Contact("ABC", 7656798887L);
        contacts[1] = new Contact("DEF", 9876556789L, "kshitiz@gmail.com");
    }


    // public static Contact[] restructureContactArray(Contact[] contacts, int contactCount){
    //     int newSize = contactCount + (contactCount / 2);
    //     Contact[] newContacts = new Contact[newSize];
    //     for(int i = 0; i < contactCount; i++){
    //         newContacts[i] = contacts[i];
    //     }
    //     return newContacts;
    // }

}
