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
        Fruit fruit = (Fruit) obj;
        boolean conditionFor = getCondition();
        // Mutant: Unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as getCondition() always returns false
        }
        return color.equals(fruit.color);
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    // Rest of the code...
}

// Rest of the code...