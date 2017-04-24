/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plus2.Marks.util.entry;

import Plus2.Marks.calculate.Calculate;
import java.util.Scanner;

/**
 *
 * @author sapu
 */
public class Entry {
    double bio, mth, phy, che, com;
    private Calculate calc;
    public Entry(){
             calc=new Calculate();
    }
    
    public void entervalues(){   
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks in bio");
        bio = input.nextDouble();
        System.out.println("Enter the marks in mth");
        mth = input.nextDouble();
        System.out.println("Enter the marks in phy");
        phy = input.nextDouble();
        System.out.println("Enter the marks in che");
        che = input.nextDouble();
        System.out.println("Enter the marks in com");
        com = input.nextDouble();
    }
    public void show(){
        System.out.println("Total is: "+calc.tot(bio, mth,phy,che,com));
         if (bio<40||mth<40||che<40||phy<40||com<40)
        System.out.println("Sorry! You are Failed!! ");
        
        else{
            double percentage = calc.tot(bio, mth,phy,che,com) / 5;
            System.out.println("Percentage is: " + calc.per());
        if (percentage>40&&percentage<60)
            System.out.println("Grade is 3rd Division");
        else if (percentage>60&&percentage<70)
            System.out.println("Grade is 2nd Division");
        else if (percentage>70&&percentage<80)
            System.out.println("Grade is 1st Division");
        else if (percentage>80)
            System.out.println("Grade is Distinction");
        }
    }
}
