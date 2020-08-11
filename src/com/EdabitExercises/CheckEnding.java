package com.EdabitExercises;

public class CheckEnding {

    /* public static boolean checkStrings(String str1, String str2) {

        boolean match;

        if((str1.substring(str1.length() - str2.length())).equals(str2))
        {
            match = true;
            System.out.println("True");
        }
        else
        {
            match = false;
            System.out.println("False");
        }

        return match;
    } */
    public static boolean endsWithString(String instr1, String instr2){
        int j=instr1.length()-1;
        boolean contains = true;
        for (int i=instr2.length()-1; i>=0; i=i-1){

            int cmp = Character.compare(Character.toLowerCase(instr1.charAt(j)), Character.toLowerCase(instr2.charAt(i)));
            //System.out.println(instr1.charAt(j) +" :: "+ instr2.charAt(i));
            if (cmp == 0)
           // if( Character.valueOf(instr1.charAt(i)).compareTo(instr1.charAt(j)) )
                j=j-1;
            else {
                contains = false;
                break;
            }
        }
        return contains;
    }
    public static boolean compareStrings(String string1, String string2){
        int x = string1.length()-1;
        boolean matches = true;

        for(int y = string2.length()-1; y >= 0; y--){
            Character char1 = Character.toLowerCase(string1.charAt(x));
            Character char2 = Character.toLowerCase(string2.charAt(y));
            int match = char1.compareTo(char2);

            if(match == 0){
                x--;
            }else{
                matches = false;
                break;
            }

        }
        return matches;
    }


}



