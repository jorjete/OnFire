package com.dam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Admin extends Usuario {
    
    public static void showCandle(List<Candle>candles)
    {
        for(Candle c:candles)
        {
            System.out.println("Name:"+c.getName()+"("+c.getCandleCode()+")");
            System.out.println("shortDescp:"+c.getShortDescp());
            System.out.println("CandleFragrance:"+c.getCandleFragrance());
            System.out.println("Price:"+c.getPrice());
        }
    }
}