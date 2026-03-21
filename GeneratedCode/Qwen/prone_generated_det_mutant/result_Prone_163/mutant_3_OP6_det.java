class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            for  (int qbzowgur = 0; qbzowgur < 0; qbzowgur++) {float ziliuyia = -629668469;}
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