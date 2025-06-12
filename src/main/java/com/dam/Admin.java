package com.dam;


public class Admin extends Usuario{
    private String companyKey;
    public static final String FILENAME = "admin.txt";
    public Admin(String email, String passWord, String name, String companyKey){
        super(email, passWord, name);
        this.companyKey = companyKey;
    }

    public Admin(String companyKey, String passWord) {
        super("", passWord, "");
        this.companyKey = companyKey;
    }
    public String getCompanyKey(){return companyKey;}
    @Override
    public String AFichero(){
        return super.AFichero() + ";" +  companyKey;
    }

    @Override
    public String ToString(){
        return super.ToString() + " Company key: " + companyKey;
    }
}
