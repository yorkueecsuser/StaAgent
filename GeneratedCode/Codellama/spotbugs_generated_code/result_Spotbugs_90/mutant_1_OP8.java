// BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);
    }
}

// Mutant 1: Renaming "y" to "z"
class SelfComputation {
    public static void main(String[] args) {
        int x = 5;
        int z = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(z);
    }
}

// Mutant 2: Renaming "x" to "a"
class SelfComputation {
    public static void main(String[] args) {
        int a = 5;
        int y = a & a; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        System.out.println(y);
    }
}