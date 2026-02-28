class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
        switch (getRandom()) {
            case 1:
                System.out.println("Random number is 1");
                break;
            case 2:
                System.out.println("Random number is 2");
                break;
            case 3:
                System.out.println("Random number is 3");
                break;
            case 4:
                System.out.println("Random number is 4");
                break;
            case 5:
                System.out.println("Random number is 5");
                break;
        }
    }

    public int showBug() {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        switch (getRandom()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
        }
    }
}