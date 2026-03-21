class NonsensicalSelfComputationBug {
public int showBug(int x){
    int result = x & x;
    result = x & x;
    return result;
}

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}