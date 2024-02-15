package A4;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        //create an ArrayList of contacts
        ArrayList<Contact> Contacts = new ArrayList<>();

        //add contacts
        Contacts.add(new Contact("Phoenix Wright", 1111));
        Contacts.add(new Contact("Maya Faye", 2222));
        Contacts.add(new Contact("Miles Edgeworth", 3333));
        Contacts.add(new Contact("Dick Gumshoe", 4444));
        Contacts.add(new Contact("Ema Skye", 4444));

        //create an ArrayList listIterator for contacts
        ListIterator<Contact> uniqueIterator = Contacts.listIterator();

        //using a while loop to cycle through contents of array
        System.out.println("Array printed forward");
        while(uniqueIterator.hasNext()){
            System.out.println(uniqueIterator.next());
        }

        //iterate through ArrayList in reverse
        System.out.println("Array printed backwards");
        while(uniqueIterator.hasPrevious()){
            System.out.println(uniqueIterator.previous());
        }

        //print size of ArrayList
        System.out.println(Contacts.size());

        //Store user input to check against the names of other contacts
        Scanner uniqueScanner = new Scanner(System.in);
        System.out.println("Which contact would you like to delete?");
        String searchName = uniqueScanner.nextLine();

        //Initialising variable to store the index of a potential match
        int iterIndex = -1;

        //Enhanced for loop to search for match
        for(Contact currentContact : Contacts) {

            System.out.print("Name: " + uniqueIterator.next());

            //If you find a match, store the index of that match
            if(currentContact.getName().equals(searchName)){
                System.out.println(" - Match!");
                System.out.println("Contact no: " + (Contacts.indexOf(currentContact) + 4));
                iterIndex = Contacts.indexOf(currentContact);
            } else {
                System.out.println(" - No match");
            }
        }

        //if a match has been found (signified by stored index) remove the object at that index
        if(iterIndex > -1) {
            System.out.println("Contact number " + (iterIndex + 1) + " removed.");
            Contacts.remove(iterIndex);
        }


        //print the contact list
        for(Contact currentContact : Contacts) {

            System.out.println(currentContact);

        }

        uniqueScanner.close();
    }
}
