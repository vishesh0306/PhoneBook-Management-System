public class DataBase {
    
    public static Contact[] contacts = new Contact[10];
    
    static{
        contacts[0] = new Contact("ABC", 7656798887L);
        contacts[1] = new Contact("DEF", 9876556789L, "kshitiz@gmail.com");
    }

    static int contactCount = 2;

    // public static Contact[] restructureContactArray(Contact[] contacts, int contactCount){
    //     int newSize = contactCount + (contactCount / 2);
    //     Contact[] newContacts = new Contact[newSize];
    //     for(int i = 0; i < contactCount; i++){
    //         newContacts[i] = contacts[i];
    //     }
    //     return newContacts;
    // }

}
