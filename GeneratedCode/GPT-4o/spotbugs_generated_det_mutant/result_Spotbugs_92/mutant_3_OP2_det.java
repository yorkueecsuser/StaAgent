class SelfComparisonExample {
public int showBug(int input){
    int localVar = input;
    localVar = input;
    if(localVar == localVar){ return 1; } else { return 0; }
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}