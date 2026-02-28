class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        int i = 1;
        int j = - - -i;
        int k = ~~~i;
        int m = + +i;

        boolean b = false;
        boolean c =!!!b;

        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("m: " + m);
        System.out.println("c: " + c);
    }
}

// Mutant 1: Duplication of int i = 1;
int i = 1;
int i = 1;

// Mutant 2: Duplication of int j = - - -i;
int j = - - -i;
int j = - - -i;

// Mutant 3: Duplication of int k = ~~~i;
int k = ~~~i;
int k = ~~~i;

// Mutant 4: Duplication of int m = + +i;
int m = + +i;
int m = + +i;

// Mutant 5: Duplication of boolean b = false;
boolean b = false;
boolean b = false;

// Mutant 6: Duplication of boolean c =!!!b;
boolean c =!!!b;
boolean c =!!!b;

// Mutant 7: Duplication of System.out.println("j: " + j);
System.out.println("j: " + j);
System.out.println("j: " + j);

// Mutant 8: Duplication of System.out.println("k: " + k);
System.out.println("k: " + k);
System.out.println("k: " + k);

// Mutant 9: Duplication of System.out.println("m: " + m);
System.out.println("m: " + m);
System.out.println("m: " + m);

// Mutant 10: Duplication of System.out.println("c: " + c);
System.out.println("c: " + c);
System.out.println("c: " + c);