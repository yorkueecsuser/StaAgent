import java.util.Objects;

class Food {
    // Base class for demonstration purposes
}

class Season {
    private String name;

    public Season(String name) {
        this.name = name;
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
            return ripe.equals(((Fruit) obj).getRipe());
        }
        if (obj instanceof Fruit) { // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(((Fruit) obj).getRipe());
        } else if (obj instanceof Season) { // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(obj);
        }
        return false;
    }

    public boolean showBug(Fruit fruit, Season season) {
        return this.equals(season);
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
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        Raspberry raspberry = (Raspberry) obj;
        return Objects.equals(color, raspberry.color);
    }
}

class EqualsSymmetryBug {
    public static void main(String[] args) {
        Season summer = new Season("Summer");
        Fruit fruit = new Fruit(summer);
        Raspberry raspberry = new Raspberry(summer, "Red");

        EqualsSymmetryBug bugDemo = new EqualsSymmetryBug();
        System.out.println("fruit.equals(raspberry): " + fruit.equals(raspberry));
        System.out.println("raspberry.equals(fruit): " + raspberry.equals(fruit));
        System.out.println("fruit.showBug(raspberry, summer): " + fruit.showBug(raspberry, summer));
    }
}