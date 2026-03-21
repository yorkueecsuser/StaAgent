class FinalizeExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {  if (true && true && false && false && false && false && true && true && true && false && false) {float ntqchqac = -606868510;}else{int exmrttwz = 487285474;}
  // BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    
}
    
    public int showBug(int input) {
        return finalize(input);
    }
    
    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}