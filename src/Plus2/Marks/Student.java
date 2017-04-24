/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plus2.Marks;

//import java.util.Scanner;
//import Plus2.Marks.calculate.Calculate;
import Plus2.Marks.util.entry.Entry;


/**
 *
 * @author sapu
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entry ent=new Entry();
        ent.entervalues();
        //double bio=4, mth=6, phy=8, che=8, com=8;
        //Calculate calc=new Calculate();
        ent.show();
        
        //System.out.println(calc.tot(bio, mth,phy,che,com));
    }
}
        
        /*
        //
        // }
        // public void entry() {

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
        // }
        // public double calculate(){
        double total = bio + mth + phy + che + com;
        System.out.println("total is: " + total);
        // return total;
        
       
        if (bio<40||mth<40||che<40||phy<40||com<40)
        System.out.println("Sorry! You are Failed!! ");
        
        else{
            double percentage = total / 5;
        System.out.println("Percentage is: " + percentage);
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

}*/
