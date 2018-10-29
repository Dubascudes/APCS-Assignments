public class Contact {
    private String name;
    private String relation;
    private String bday;
    private String phone;
    private String email;


    public Contact(String name, String relation, String bday, String phone, String email) 
    {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }

    public String toString() 
    {
        return String.format("%-13s%15s%10s%19s%24s", this.name, this.relation, this.bday, this.phone, this.email);
    }

    public String getName() 
    {
        return name;
    }

    public String getRelation() 
    {
        return relation;
    }

    public String getBday() 
    {
        return bday;
    }

    public String getPhone() 
    {
        return phone;
    }

    public String getEmail() 
    {
        return email;
    }

}