class NullPointerExample {

    public void showBug() {
        String str = null;
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        int qwejfnxz = 42; // Dead store mutation
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