class ThrowNullBug {
    public boolean getCondition() {
        return false; // Method to return false dynamically
    }

    public void showBug() {
        for (int i = 0; getCondition(); i++) { // Inserted unreachable for loop
            System.out.println("This is a mutant code");
        }
        throw null; // Original code
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}