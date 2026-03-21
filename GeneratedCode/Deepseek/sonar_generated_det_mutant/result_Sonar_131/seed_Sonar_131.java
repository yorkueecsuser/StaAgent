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
        if (Fruit.class == obj.getClass()) { // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(((Fruit)obj).getRipe());
        }
        if (obj instanceof Fruit ) {  // BUG: "equals" methods should be symmetric and work for subclasses
            return ripe.equals(((Fruit)obj).getRipe());
        }
        else if (obj instanceof Season) { // BUG: "equals" methods should be symmetric and work for subclasses
            //...
        }
        //...
        return false;
    }

    public Season getRipe() {
        return ripe;
    }

    public void setRipe(Season ripe) {
        this.ripe = ripe;
    }
}

class Food {
    //...
}

class Season {
    //...
}