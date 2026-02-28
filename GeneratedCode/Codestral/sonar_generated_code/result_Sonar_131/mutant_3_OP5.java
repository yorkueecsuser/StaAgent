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

        // Unreachable switch statement mutation operator
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This code should never be reached");
                    break;
            }
        }

        return color.equals(fruit.color);
    }

    //... other methods...

    // Dummy method to avoid compile error
    private boolean getCondition() {
        return false;
    }
}