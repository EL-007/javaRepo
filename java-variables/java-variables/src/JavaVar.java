public class JavaVar {
//datatypes
//class level vars

public static void main(String[] args) throws Exception {
    // datatype varName [=value];
    int games = 3;
    double allowance = 40.50;
    long battlepass; //We define battlepass
    battlepass = 15;//We assign a value to battle pass

    //Print out our variables values along with a string that expains our values
    System.out.println(" ");
    System.out.println("Number of games I own = " + games);
    System.out.println("My monthly allowance = " + allowance);
    System.out.println("Cost of a single battle pass = " + battlepass);

    //With our current Allowance, how many battle pass will we be able to buy?
    System.out.println("Number of gamepasses I'm able to buy currently = " + allowance/battlepass);
    //Find out the amount of game battlepasses the account can buy with the avaliable allowance. By dividing the cost of a single battlepass from the amount of allowance avaliable

    //What is the total cost of battle passes 
    System.out.println("The total cost to purchase a battlepass in each game I own = " + games*battlepass);
    //Find out the total cost to buy all the battlepasses from the games that the account own, by multiplying the amount of games by the cost of a single battlepass
}
    }