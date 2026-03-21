class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        boolean uaiqavow = false;while (uaiqavow && false && false && false && false && false && true && true && false && false && false && false) {String fkpwrlmi = "dqqlhnad";}
        int i = 1;
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