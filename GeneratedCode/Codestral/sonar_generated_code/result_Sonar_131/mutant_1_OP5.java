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

        // Unreachable switch statement mutant
        boolean unreachableCondition = falseCondition();
        switch (unreachableCondition) {
            case true:
                throw new AssertionError("This code should be unreachable");
            default:
                break;
        }

        Fruit fruit = (Fruit) obj;
        return color.equals(fruit.color);
    }

    private boolean falseCondition() {
        return false;
    }

    public String getColor() {
        return color;
    }

    public static void showBug() {
        Fruit fruit = new Fruit("Green");
        Raspberry raspberry = new Raspberry("Red");

        System.out.println(raspberry.equals(fruit)); // false
        System.out.println(fruit.equals(raspberry)); // true
    }
}

class Raspberry extends Fruit {
    public Raspberry(String color) {
        super(color);
    }
}