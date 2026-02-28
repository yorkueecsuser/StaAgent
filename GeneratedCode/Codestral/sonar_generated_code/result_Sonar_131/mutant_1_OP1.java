// Java code demonstrating the bug "equals" methods should be symmetric and work for subclasses

class Fruit {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    // Symmetry breaking bug - Fruit is not an instance of Raspberry
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null ||!(obj instanceof Fruit)) {
            return false;
        }
        Fruit fruit = (Fruit) obj;
        return color.equals(fruit.color);
    }

    public String getColor() {
        return color;
    }

    public static void showBug() {
        Fruit fruit = new Fruit("Green");
        Raspberry raspberry = new Raspberry("Red");

        // Introducing a dead store
        String unnecessaryVariable = "This variable is not used anywhere in the code.";

        // Bug occurs here - Raspberry is a Fruit, but Fruit is not a Raspberry
        System.out.println(raspberry.equals(fruit)); // false
        System.out.println(fruit.equals(raspberry)); // true
    }
}

class Raspberry extends Fruit {
    public Raspberry(String color) {
        super(color);
    }
}