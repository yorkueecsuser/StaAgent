// Java code generated to demonstrate the bug "equals" methods should be symmetric and work for subclasses
class Food {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Season {
    private String name;

    Season(String name) {
        this.name = name;
    }
@ Override public boolean equals(Object obj){
    if(obj == this){ return true; }
    if(obj == null || getClass() != obj.getClass()){ return false; }
    Season season =(Season)obj;
    season =(Season)obj;
    return name.equals(season.name);
}
}

class Fruit extends Food {
    private Season ripe;

    Fruit(Season ripe) {
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
        if (Fruit.class == obj.getClass()) { // Noncompliant; broken for child classes
            return ripe.equals(((Fruit) obj).getRipe());
        }
        return false;
    }

    public boolean showBug(Fruit fruit) {
        return this.equals(fruit); // may return false for subclasses of Fruit
    }
}

class Raspberry extends Fruit {
    private String color;

    Raspberry(Season ripe, String color) {
        super(ripe);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        Raspberry raspberry = (Raspberry) obj;
        return color.equals(raspberry.color);
    }
}