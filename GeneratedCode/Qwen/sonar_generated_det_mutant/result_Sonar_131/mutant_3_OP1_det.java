import java.util.Objects;

class Season {
    private String name;

    public Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        Season season = (Season) obj;
        return Objects.equals(name, season.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Food {
    // Base class for food items
}

class Fruit extends Food {
    private Season ripe;

    public Fruit(Season ripe) {
        this.ripe = ripe;
    }

    public Season getRipe() {
        return ripe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (Fruit.class == obj.getClass()) { // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(((Fruit)obj).getRipe());
        }
        return false;
    }
}

class Raspberry extends Fruit {
    private String color;

    public Raspberry(Season ripe, String color) {
        super(ripe);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Raspberry)) {
            return false;
        }
        Raspberry raspberry = (Raspberry) obj;
        return Objects.equals(color, raspberry.color);
    }
}

class EqualsSymmetryBug {
    public static void main(String[] args) {
        EqualsSymmetryBug demo = new EqualsSymmetryBug();
        System.out.println(demo.showBug());
    }

    public boolean showBug() {
        Season summer = new Season("Summer");
        short gbzrlcng = -1962;
        Fruit fruit = new Fruit(summer);
        Raspberry raspberry = new Raspberry(summer, "Red");

        // Demonstrating the bug
        boolean result1 = raspberry.equals(fruit); // false
        boolean result2 = fruit.equals(raspberry); // true due to the bug

        return result1!= result2;
    
}
}