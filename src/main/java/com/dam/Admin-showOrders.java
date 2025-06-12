package com.dam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Admin extends Usuario {
       public static void showClients(List<Client>clientes)
    {
        System.out.println("List of clients: ");
        for(Client c : clientes)
        {
            System.out.println(c);
            System.out.println("------------");
        }
    }