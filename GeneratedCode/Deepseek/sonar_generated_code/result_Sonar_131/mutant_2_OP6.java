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
        
        for (int i = 0; i < 10; i++) {
            if (i == 10) {
                return false; // Unreachable for loop mutation
            }
        }
        
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