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

        // Unreachable for loop mutant
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This code block is unreachable, so we can leave it empty
        }

        return color.equals(fruit.color);
    }

    // Add a method to generate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public String getColor() {
        return color;
    }

    public static void showBug() {
        Fruit fruit = new Fruit("Green");
        Raspberry raspberry = new Raspberry("Red");

        System.out.println(raspberry.equals(fruit));
        System.out.println(fruit.equals(raspberry));
    }
}

class Raspberry extends Fruit {
    public Raspberry(String color) {
        super(color);
    }
}