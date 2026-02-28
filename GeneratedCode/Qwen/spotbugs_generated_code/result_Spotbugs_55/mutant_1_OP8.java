class NullPointerExample {

    public void showBug() {
        String str = null;
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)

        // Mutated code with renaming operator
        String a = "example";
        int b = a.length();
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