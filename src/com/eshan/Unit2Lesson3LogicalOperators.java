package com.eshan;

public class Unit2Lesson3LogicalOperators {

        public static void main(String[] args){
            int temp = 22;
            boolean isWarm = temp > 20 && temp < 30;//&& is a logical operator
            //&& makes it so that both conditions must be fulfilled in order for it to be true
            System.out.println(isWarm);

            boolean highIncome = false;
            boolean goodCredit = true;
            boolean isCriminal = false;
            boolean isEligible = (highIncome || goodCredit) && !isCriminal;
            //|| means or so it will be true if either of the conditions is fulfilled
            // the not operator '!' reverses the value of the boolean
            System.out.println(isEligible);
        }
}
