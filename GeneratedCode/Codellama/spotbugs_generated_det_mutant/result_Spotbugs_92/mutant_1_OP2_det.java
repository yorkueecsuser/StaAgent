class SelfComparisonBug {
public static void main(String [] args){
    int x = 5;
    x = 5;
    if(x == x){ System.out.println("x is equal to itself"); } else { System.out.println("x is not equal to itself"); }
}
}