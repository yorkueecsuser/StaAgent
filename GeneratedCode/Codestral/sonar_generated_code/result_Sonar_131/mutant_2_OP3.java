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

        // Mutant: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable, so it can be any harmful behavior
            // For this example, let's assume it's throwing an exception
            throw new RuntimeException("Unreachable code executed!");
        }

        return color.equals(fruit.color);
    }

    public String getColor() {
        return color;
    }

    // This method will ensure that the condition is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    // Other methods...
}

class Raspberry extends Fruit {
    public Raspberry(String color) {
        super(color);
    }
}