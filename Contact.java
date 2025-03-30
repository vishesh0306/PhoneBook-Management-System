public class Contact {

    private String name;
    private long phoneNo;
    private String email;

    Contact(String name, long phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }

    Contact(String name, long phoneNo, String email){
        this(name, phoneNo);
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public Long getPhoneNo(){
        return this.phoneNo;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNo(long phoneNo){
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
}