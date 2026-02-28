class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int negativeValue = -1;
        if (negativeValue < 0) {
            throw new IllegalArgumentException("NegativeValue cannot be negative"); //Mutation: Renaming
        }
    }
}