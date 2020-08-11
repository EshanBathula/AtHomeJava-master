package com.RuneScape;

public class Person {
    public static void main(String[] args){
        Person person1 = new Person("Eshan");
        System.out.println(person1);
        Person person2 = new Person("Beshan");
        person2.setPhoneNumber("925-436-7937");
        person2.setEmail("bathula.eshan@gmail.com");
        System.out.println(person2);
    }

    private String name;//private means these variables can only be seen and used in this class
    private String email;
    private String phoneNumber;

    public Person(String theName)
    {
        this.name = theName;
    }
//these are the getters that get the fields/data
    public String getName() {return this.name;}
    public String getEmail() {return this.email;}
    public String getPhoneNumber() {return this.phoneNumber;}
//these are the setters that set the field/data
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String toString()
    {
        return this.name + " " + this.email + " " + this.phoneNumber + " ";
    }


}
