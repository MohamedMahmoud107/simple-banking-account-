
package assiment.pkg4;
import java.util.Scanner;
public class Assiment4 {
    public static void main(String[] args) {
        System.out.println("welcome"); 
           double balance=5000;
              Scanner cs=new Scanner(System.in);
             int z=1;
              while(z!=0){
                  System.out.println("select your purpose");
                  System.out.println("1.withdraw");
                  System.out.println("2.depsoite");
                     System.out.println("3.check balance");
                        System.out.println("4.exist");
                          int x=cs.nextInt();
                            switch(x){
                                case 1 : 
                                    System.out.println("enter the amount of many  you want to with draw");
                                    double withdraw=cs.nextDouble();
                                    if(withdraw>0&&withdraw<balance) {
                                        System.out.println("sucessful operation");
                                        balance-=withdraw;}
                                    else if (withdraw>0&&withdraw>balance)
                                        System.out.println("your balance is less than the amount you want");
                                    else System.out.println("unlogic number");
                                    System.out.println("choose another operation");
                break;
                                case 2 :
                                    System.out.println("enter the amount of many you want to deposite");
                                    double deposite=cs.nextDouble();
                                    if(deposite>0)
                                    {
                                        System.out.println("sucessful operation");
                                        balance+=deposite;
                                    }
                                    else 
                                        System.out.println("un logic number");
                                    System.out.println("choose another operation");
                                    break;
                
                                case 3 :
                                    System.out.println("your balance is"+balance);
                                      System.out.println("choose another operation");
                                    break;
                                case 4 : 
                                    System.out.println("thanks");
                                    z=0;
                break;
                                default:
                                    System.out.println("the number isn't at atm list");
                                break;
                            }
                            
                                    
               
               
               }
                
               
             
    }
    
}
