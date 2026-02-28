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
        // Mutation 1: Inserting an unreachable switch statement into a randomly selected basic block in the program
        int mutationCondition = 0;
        switch (mutationCondition) {
            case 0:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
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