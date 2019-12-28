package com.example.ia;

import android.content.Context;
import android.content.SharedPreferences;

public class global {
    public static void SaveUser1(Context context, String User1, String Password1)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName1", User1);
        editor.putString("Password1", Password1);
        editor.commit();
    }

    public static boolean CheckUser1(Context context, String user1, String password1)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username1 = pref.getString("UserName1", null);
        String Password1 = pref.getString("Password1", null);

        if(Username1.equals(user1) && Password1.equals(password1))
            return true;
        else
            return false;
    }

    public static void SaveUser2(Context context, String User2, String Password2)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName2", User2);
        editor.putString("Password2", Password2);
        editor.commit();
    }

    public static boolean CheckUser2(Context context, String user2, String password2)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username2 = pref.getString("UserName2", null);
        String Password2 = pref.getString("Password2", null);

        if(Username2.equals(user2) && Password2.equals(password2))
            return true;
        else
            return false;
    }

    public static void SaveUser3(Context context, String User3, String Password3)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName3", User3);
        editor.putString("Password3", Password3);
        editor.commit();
    }

    public static boolean CheckUser3(Context context, String user3, String password3)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username3 = pref.getString("UserName3", null);
        String Password3 = pref.getString("Password3", null);

        if(Username3.equals(user3) && Password3.equals(password3))
            return true;
        else
            return false;
    }

    public static void SaveUser4(Context context, String User4, String Password4)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName4", User4);
        editor.putString("Password4", Password4);
        editor.commit();
    }

    public static boolean CheckUser4(Context context, String user4, String password4)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username4 = pref.getString("UserName4", null);
        String Password4 = pref.getString("Password4", null);

        if(Username4.equals(user4) && Password4.equals(password4))
            return true;
        else
            return false;
    }

    public static void SaveUser5(Context context, String User5, String Password5)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName5", User5);
        editor.putString("Password5", Password5);
        editor.commit();
    }

    public static boolean CheckUser5(Context context, String user5, String password5)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username5 = pref.getString("UserName5", null);
        String Password5 = pref.getString("Password5", null);

        if(Username5.equals(user5) && Password5.equals(password5))
            return true;
        else
            return false;
    }

    public static void SaveUser6(Context context, String User6, String Password6)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName6", User6);
        editor.putString("Password6", Password6);
        editor.commit();
    }

    public static boolean CheckUser6(Context context, String user6, String password6)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username6 = pref.getString("UserName6", null);
        String Password6 = pref.getString("Password6", null);

        if(Username6.equals(user6) && Password6.equals(password6))
            return true;
        else
            return false;
    }

    public static void SaveUser7(Context context, String User7, String Password7)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName7", User7);
        editor.putString("Password7", Password7);
        editor.commit();
    }

    public static boolean CheckUser7(Context context, String user7, String password7)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username7 = pref.getString("UserName7", null);
        String Password7 = pref.getString("Password7", null);

        if(Username7.equals(user7) && Password7.equals(password7))
            return true;
        else
            return false;
    }

    public static void SaveUser8(Context context, String User8, String Password8)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName8", User8);
        editor.putString("Password8", Password8);
        editor.commit();
    }

    public static boolean CheckUser8(Context context, String user8, String password8)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username8 = pref.getString("UserName8", null);
        String Password8 = pref.getString("Password8", null);

        if(Username8.equals(user8) && Password8.equals(password8))
            return true;
        else
            return false;
    }

    public static void SaveUser9(Context context, String User9, String Password9)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName9", User9);
        editor.putString("Password9", Password9);
        editor.commit();
    }

    public static boolean CheckUser9(Context context, String user9, String password9)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username9 = pref.getString("UserName9", null);
        String Password9 = pref.getString("Password9", null);

        if(Username9.equals(user9) && Password9.equals(password9))
            return true;
        else
            return false;
    }

    public static void SaveUser10(Context context, String User10, String Password10)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("UserName10", User10);
        editor.putString("Password10", Password10);
        editor.commit();
    }

    public static boolean CheckUser10(Context context, String user10, String password10)
    {
        SharedPreferences pref = context.getSharedPreferences("IA2", 0);
        String Username10 = pref.getString("UserName10", null);
        String Password10 = pref.getString("Password10", null);

        if(Username10.equals(user10) && Password10.equals(password10))
            return true;
        else
            return false;
    }
}