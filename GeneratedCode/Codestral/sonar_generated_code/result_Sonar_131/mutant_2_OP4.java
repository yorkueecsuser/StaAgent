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
        boolean condition = getCondition();
        if (condition) {
            // This branch will never be executed
            if (false) {
                System.out.println("Unreachable code");
            } else {
                System.out.println("Always executed code");
            }
        }
        return color.equals(fruit.color);
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

    private boolean getCondition() {
        // This method always returns true
        return true;
    }
}

class Raspberry extends Fruit {
    public Raspberry(String color) {
        super(color);
    }
}