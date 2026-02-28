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
        switch (0) { // Unreachable block
          case 1: // This is a non-reacheable case
            break;
        }
        return false; // Non-bug: "equals" methods should be symmetric and work for subclasses
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