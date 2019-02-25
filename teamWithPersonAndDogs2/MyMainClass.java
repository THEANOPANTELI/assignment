/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d1.teamWithPersonAndDogs2;

import w3d1.teamWithPersonAndDogs2.Dog;
import w3d1.teamWithPersonAndDogs2.Person;
import w3d1.teamWithPersonAndDogs2.PlayersPerTeam;
import w3d1.teamWithPersonAndDogs2.Team;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tasos
 */
public class MyMainClass {

    /**
     * @param args the command line arguments
     */
    static int a;
    public static void main(String[] args) {
        a = 4;
        Dog d1 = new Dog("Jack", "jack russel");
        Dog d2 = new Dog("Martha", "bulldog");
        Dog d3 = new Dog("Jerry", "dalmatian");
        
        System.out.println(d1);
        
        Person p1 = new Person("Bill", "Jon", 23);
        Person p2 = new Person("John", "Luther", 18);
        Person p3 = new Person("Bruce", "Lee", 19);
        
        Person p4 = new Person("Maria", "Marian", 21);
        Person p5 = new Person("Popi", "Popian", 22);
        Person p6 = new Person("Jeniffer", "Jenifferian", 25);
        
        Person p7 = new Person(d1, "Jeniffer", "Jenifferian", 25);
        Person p8 = new Person("Jeniffer", "Jenifferian", 25);
        p8.setDog(d3);
        System.out.println(p8);
        Team t1 = new Team("Panthers", "football");
        System.out.println(t1.getPlayers());
        
        List<Person> listOfPlayers = new ArrayList();
        listOfPlayers.add(p1);
        listOfPlayers.add(p2);
        listOfPlayers.add(p3);
        System.out.println(listOfPlayers);
        for(int i = 0;i<listOfPlayers.size();i++){
            System.out.println(listOfPlayers.get(i).getFname());
        }
        
        t1.setPlayers(listOfPlayers);
        List<Person> listOfPlayers2 = new ArrayList();
        listOfPlayers2.add(p4);
        listOfPlayers2.add(p5);
        listOfPlayers2.add(p6);
        Team t2 = new Team();
        t2.setPlayers(listOfPlayers2);
        PlayersPerTeam ppt1 = new PlayersPerTeam();
        ppt1.team = t1;
        ppt1.players = listOfPlayers;
        
        Dog d4 = new Dog();
        d4 = null;
        System.out.println(d4);
        d4 = new Dog();
        System.out.println(d4);

    }
    
}
