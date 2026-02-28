class Fruit {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null ||!(obj instanceof Fruit)) {
            return false;
        }

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("This code will never execute.");
        } else {
            Fruit fruit = (Fruit) obj;
            return color.equals(fruit.color);
        }
    }

    // Method to simulate a runtime-determined condition
    private boolean getUnreachableCondition() {
        return false;
    }

    // Rest of the code remains the same
}