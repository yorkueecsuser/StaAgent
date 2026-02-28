import java.util.Objects;

class Fruit extends Food {
    private Season ripe;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            return ripe.equals(((Fruit)obj).getRipe());
        }
        // Unreachable while loop
        while (false) {}
        return false; // BUG: "equals" methods should be symmetric and work for subclasses
    }

    public Season getRipe() {
        return ripe;
    }

    public void setRipe(Season ripe) {
        this.ripe = ripe;
    }

    // Test method to demonstrate the bug
    public boolean showBug() {
        Fruit f = new Fruit();
        return f.equals(new Season());
    }
}

class Food {
}

class Season {
}