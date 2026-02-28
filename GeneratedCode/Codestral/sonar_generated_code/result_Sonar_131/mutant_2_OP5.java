class Fruit {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        boolean unreachableCondition = false;
        // Unreachable switch statement mutant
        switch (unreachableCondition) {
            case true:
                System.out.println("Unreachable code");
                break;
        }

        if (obj == this) {
            return true;
        }
        if (obj == null ||!(obj instanceof Fruit)) {
            return false;
        }
        Fruit fruit = (Fruit) obj;
        return color.equals(fruit.color);
    }

    //... rest of the class
}