/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbs;

/**
 *
 * @author rober
 */
public class Person {
    private final String Name;
    private final String Surname;
    private short Age;

    public Person(String Name, String Surname, short Age) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public short getAge() {
        return Age;
    }
    
    
}
