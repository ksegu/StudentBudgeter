import java.util.ArrayList;
import java.util.Scanner;
public class BudgetTester {
    public static void main(String[]args){
    
    	Scanner input=new Scanner(System.in);
    
    double [] allPossibleCosts=new double[7];
    System.out.println("What's your weekly budget?");
    allPossibleCosts[0] = input.nextDouble();
    System.out.println("Input rent paid: ");
     allPossibleCosts[1] = input.nextDouble();
    System.out.println("Input income after taxes: ");
    allPossibleCosts[2] = input.nextDouble();
    System.out.println("Input amount spent on groceries: ");
    allPossibleCosts[3] = input.nextDouble();
    System.out.println("Input amount spent on restaurants/fast food: ");
    allPossibleCosts[4] = input.nextDouble();
    System.out.println("Input  amount spent on clothes: ");
    allPossibleCosts[5] = input.nextDouble();
    System.out.println("Input amount spent on education supplies: ");
    allPossibleCosts[6] = input.nextDouble();

    Money myMoney= new Money(allPossibleCosts);
    //if(myMoney.getSavings() > 0) {
    	
    	
    //}
    
    System.out.println(myMoney);
    
    //Money myMoney= new Money(allPossibleCosts);



}//end of MoneyInput
}