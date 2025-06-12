package com.dam;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

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

    //LoadAdmin
    public static List<Admin> LoadAdmin()
    {
        List<Admin>admins=new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(";");
                if (parts.length >= 4) {
                    String email = parts[0];
                    String contrasenya = parts[1];
                    String nombre = parts[2];
                    String companyKey = parts[3];

                    Admin admin = new Admin(email, contrasenya, nombre, companyKey);

                    admins.add(admin);
                }
            }
        }
        catch(IOException e)
        {
            System.err.println("Error:"+e.getMessage());
        }
        return admins;
    }
}
