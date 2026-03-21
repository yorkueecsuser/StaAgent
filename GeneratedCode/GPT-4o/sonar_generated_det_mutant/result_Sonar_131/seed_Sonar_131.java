class Food {
    // Basic functionality for a food item
}

class Season {
    private String name;

    public Season(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Season season = (Season) obj;
        return name.equals(season.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class Fruit extends Food {
    private Season ripe;

    public Fruit(Season ripe) {
        this.ripe = ripe;
    }

    public Season getRipe() {
        return ripe;
    }

    // Noncompliant equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (Fruit.class == obj.getClass()) { // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(((Fruit) obj).getRipe());
        }
        if (obj instanceof Fruit) { // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(((Fruit) obj).getRipe());
        }
        if (obj instanceof Season) { // BUG: "equals" methods should be symmetric and work for subclasses
            // Symmetry broken for Season class
            return false;
        }
        return false;
    }

    public boolean showBug() {
        Fruit fruit = new Fruit(new Season("Summer"));
        Raspberry raspberry = new Raspberry(new Season("Summer"));
        return fruit.equals(raspberry) && raspberry.equals(fruit);
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit(new Season("Summer"));
        Raspberry raspberry = new Raspberry(new Season("Summer"));
        
        System.out.println("fruit.equals(raspberry): " + fruit.equals(raspberry));
        System.out.println("raspberry.equals(fruit): " + raspberry.equals(fruit));
    }
}

class Raspberry extends Fruit {
    public Raspberry(Season ripe) {
        super(ripe);
    }

    // Raspberry might have its own additional fields and methods
}