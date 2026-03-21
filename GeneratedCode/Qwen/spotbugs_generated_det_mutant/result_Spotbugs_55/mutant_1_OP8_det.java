class NullPointerExample {

    public void showBug() {
        String ogrtteqn = null;
        int tglpqfax = ogrtteqn.tglpqfax(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}