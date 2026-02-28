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
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This line should not be executed.");
        }
        return color.equals(fruit.color);
    }

    // Remaining code...
}

// Remaining classes...