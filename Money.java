package com.example.kishan_s.budgetbalancer;

/**
 * Created by Kishan_S on 4/8/17.
 */

public class Money {
        private double [] allPossibleCosts;
        public Money(double [] possibleCosts){
            allPossibleCosts = possibleCosts;
        }
        public double addCosts(){
            double sum=0.0;
            for(int i=1;i<allPossibleCosts.length;i++){
                sum+=allPossibleCosts[i];
            }
           sum = sum - allPossibleCosts[2];
            if (sum < 0) {
                return 0;
            }
            else {
                return sum;
            }
        }
        public double getSavings(){
            double savings = allPossibleCosts[2] - addCosts();
            return savings;
        }
        public double percentOfTotalSpent(){
            double percent = 0.0;
            double income = allPossibleCosts[2];
            double allCosts = addCosts();
            percent = (allCosts / income)*100;
            return percent;
        }
        public double percentSpentClothes(){
            double percent = 0.0;
            double budget = allPossibleCosts[0];
            double clothes = allPossibleCosts[5];
            percent = (clothes / budget)*100;
            return percent;
        }
        public double percentSpentRent(){
            double percent = 0.0;
            double budget = allPossibleCosts[0];
            double rent = allPossibleCosts[1];
            percent = (rent/ budget)*100;
            return percent;

        }
        public double percentSpentGroceries(){
            double percent = 0.0;
            double budget = allPossibleCosts[0];
            double groceries = allPossibleCosts[3];
            percent = (groceries / budget)*100;
            return percent;
        }
        public double percentOutsideFood(){
            double percent = 0.0;
            double budget = allPossibleCosts[0];
            double outsideFood= allPossibleCosts[4];
            percent = (outsideFood / budget)*100;
            return percent;
        }
        public double percentSpentEducationalSupplies(){
            double percent = 0.0;
            double budget = allPossibleCosts[0];
            double educationalSupplies = allPossibleCosts[6];
            percent = (educationalSupplies/ budget)*100;
            return percent;
        }
        public double percentSpentBudget(){
            double percent = 0.0;
            double budget = allPossibleCosts[0];
            double costs = addCosts();
            percent = (costs/budget)*100;
            return percent;

        }

}
