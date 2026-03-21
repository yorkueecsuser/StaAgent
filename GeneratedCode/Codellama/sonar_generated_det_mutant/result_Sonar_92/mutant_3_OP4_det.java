class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        int i = 1;
        if (true && false && true && true && false && true && false && false && false && true && false) {long cbannpis = -123073773;}else{byte nubmusou = 47;}
        int j = - - -i;  // Noncompliant: equivalent to "-i"
        int k = ~~~i;    // Noncompliant: equivalent to "~i"
        int m = + +i;    // Noncompliant: equivalent to "i"

        boolean b = false;
        boolean c =!!!b;   // Noncompliant

        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("m: " + m);
        System.out.println("c: " + c);
    
}
}