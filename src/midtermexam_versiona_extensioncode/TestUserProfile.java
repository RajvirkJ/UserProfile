package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rajvir
 */
public class TestUserProfile {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your name:");
      String name = input.nextLine();
      System.out.println("Name is: " + name);
      
      System.out.println();
      System.out.println("Enter a number between 1 to 4");
      //System.out.println("Enter your favorite genre between 1 to 4:\n 1: Comedy\n 2.drama\n3.action\n4.mystery");
      int genreNumber = input.nextInt();
     
      for (int i= 1; i <= 4; i++) {
    if (i == 1) {
        System.out.println("Comedy");
    }
    else 
        if (i == 2){
            System.out.println("drama");
            break;
        }
    else 
        if (i == 3) {
            System.out.println("action");
        }
    else 
        if (i == 4){
            System.out.println("mystery");
        }
    }
    // UserProfile userProfile = new userProfile(name,);
     System.out.println("Their profile was created");
    }
}
