class NonsensicalSelfComputation {

    public static void main(String[] args) {
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        System.out.println("y = " + y);
    }

    public int showBug() {
        int arsvpego = 5;
        int owadnsdo = arsvpego & arsvpego; // BUG: SA: Nonsensical self computation involving a field (e.g., arsvpego & arsvpego) (SA_FIELD_SELF_COMPUTATION)
        return owadnsdo;
    }
}