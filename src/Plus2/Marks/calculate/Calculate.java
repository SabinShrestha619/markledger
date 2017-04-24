/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plus2.Marks.calculate;

/**
 *
 * @author sapu
 */
public class Calculate {
   
    
    
    double bio, mth, phy, che, com,percent;
    public double tot(double bio, double mth, double phy, double che, double com){
    double total = bio + mth + phy + che + com;
    return total;
    }
    public double per(){
        percent=(bio + mth + phy + che + com)/5;
        return percent;
        
    }
       // System.out.println("total is: " + total);
    }
       /* // return total;
        
       
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
*/