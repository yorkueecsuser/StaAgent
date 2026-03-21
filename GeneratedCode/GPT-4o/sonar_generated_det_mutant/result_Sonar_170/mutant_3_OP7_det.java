class FinalizeExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {  boolean iglktfaq = false;while (iglktfaq && true && true && false && false && true && false && true && true && true && true && false) {char bptxewgs = 'e';}
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