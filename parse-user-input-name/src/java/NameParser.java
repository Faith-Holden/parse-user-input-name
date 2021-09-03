package java;

import textio.TextIO;

public class NameParser {
    public static void main(String[]args){
        System.out.println("Please type your first and last name, separated by a space.");
        String fullName = TextIO.getln();
        int nameSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0,nameSpace);
        String lastName = fullName.substring(nameSpace+1);
        String initials = fullName.substring(0,1).concat(fullName.substring(nameSpace+1, nameSpace+2));
        System.out.println("Your first name is "+firstName+", which has "+firstName.length()+ " characters.");
        System.out.println("Your last name is "+lastName+", which has "+lastName.length()+ " characters.");
        System.out.println("Your initials are "+ initials +".");
    }
}
