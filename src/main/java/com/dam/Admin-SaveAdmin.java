package com.dam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Admin extends Usuario {
    //LoadAdmin
    public static List<Admin>LoadAdmin()
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

    //Save Admin
    public static void saveAdmin(List<Admin>admins)throws IOException
    {
        BufferedWriter writer=new BufferedWriter(new FileWriter(FILENAME));

        for(Admin a:admins)
        {
            writer.write(a.AFichero());
            writer.newLine();
        }
        writer.close();
    }
}