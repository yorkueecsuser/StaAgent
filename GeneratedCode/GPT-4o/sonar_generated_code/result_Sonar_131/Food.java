class Food {}

class Season {
    private String season;

    public Season(String season) {
        this.season = season;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Season) {
            return season.equals(((Season) obj).season);
        }
        return false;
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
        else if (obj instanceof Season) { // BUG: "equals" methods should be symmetric and work for subclasses
            // This part breaks the symmetry with Season class
            return true;
        }
        return false;
    }
}

class Raspberry extends Fruit {
    public Raspberry(Season ripe) {
        super(ripe);
    }
}

class Main {
    public boolean showBug() {
        Fruit fruit = new Fruit(new Season("Summer"));
        Raspberry raspberry = new Raspberry(new Season("Summer"));
        
        // Demonstrate the bug
        boolean result1 = raspberry.equals(fruit); // false
        boolean result2 = fruit.equals(raspberry); // true
        
        return result1 != result2; // Should return true to show the bug
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Bug Demonstration: " + main.showBug());
    }
}