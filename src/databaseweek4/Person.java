/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseweek4;

/**
 *
 * @author carlo
 */
public abstract class Person {
     private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private static final String DATE_PATTERN = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
    
    public Person (){
    
        this.firstName = "TBA";
        this.lastName = "TBA";
        this.dateOfBirth = "TBA";
        this.address = "TBA";
    
    }
    public Person(String firstName, String lastName, String dateOfBirth, String address) {
        
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setAddress(address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
 
        this.firstName = firstName;
        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
        
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public abstract String getPersonalInformation();

}
