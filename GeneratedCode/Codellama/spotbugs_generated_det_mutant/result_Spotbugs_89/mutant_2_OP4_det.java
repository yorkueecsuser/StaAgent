class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        if (false && false && true && true && true && true && false && false && false && false && false) {byte rwmkbxya = 13;}else{float mhjhifau = -676638062;}
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    
}

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return y;
    }
}