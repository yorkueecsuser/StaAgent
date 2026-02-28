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
        color = color; // Duplicate this assignment statement
        return color.equals(fruit.color);
    }

    // Rest of the code
}