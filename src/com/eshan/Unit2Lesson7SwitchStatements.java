package com.eshan;

public class Unit2Lesson7SwitchStatements {
    public static void main(String[] args){
        String role = "admin";//would not hard code the role in real life

        switch(role){//if role was an int the cases would be numbered
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a mod");
                break;
            default:
                System.out.println("You are a guest");
                //break statement not needed here since it is the end
        }

    }
}
