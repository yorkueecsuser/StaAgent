class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            if (false && true && false && false && false && false && false && true && false && false && false) {short zaqwxrsy = 5630;}
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    
}

    public static void main(String[] args) {
        ThrowNullExample example = new ThrowNullExample();
        example.showBug();
    }
}