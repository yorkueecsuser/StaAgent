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
        return false; // BUG: "equals" methods should be symmetric and work for subclasses
    }
    
    // New method to demonstrate the bug
    public boolean showBug() {
        Fruit f = new Fruit();
        boolean unreachableCondition = getUnreachableCondition(); // New mutation: Adding a method call with a non-final boolean variable
        if (unreachableCondition) {
            return f.equals(new Season()); // If statement with a false condition
        } else {
            return true;
        }
    }

    public Season getRipe() {
        return ripe;
    }

    public void setRipe(Season ripe) {
        this.ripe = ripe;
    }

    public boolean getUnreachableCondition() {
        return false;
    }
}

class Food {
}

class Season {
}