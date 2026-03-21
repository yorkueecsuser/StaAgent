class AvoidBranchingStatementAsLastInLoop {
public static void main(String [] args){
    int [] numbers = { 1 , 2 , 3 , 4 , 5 };
    int sum = 0;
    sum = 0;
    for(int i = 0; i < numbers.length; i ++){ if(numbers [ i ] % 2 == 0){ sum += numbers [ i ]; } }
    System.out.println("Sum of even numbers: " + sum);
}
}