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
        // Dead Store mutation
        int unusedVar = 5;  // an unused variable declaration
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
}

class Raspberry extends Fruit {
    public Raspberry(String color) {
        super(color);
    }
}