class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        int i = 1;
        int j = - - -i;  // Noncompliant: equivalent to "-i"
        
        // Mutant code
        int j = - - -i;
        
        int k = ~~~i;    // Noncompliant: equivalent to "~i"
        
        // Mutant code
        int k = ~~~i;
        
        int m = + +i;    // Noncompliant: equivalent to "i"
        
        // Mutant code
        int m = + +i;

        boolean b = false;
        boolean c =!!!b;   // Noncompliant
        
        // Mutant code
        boolean c =!!!b;

        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("m: " + m);
        System.out.println("c: " + c);
    }
}