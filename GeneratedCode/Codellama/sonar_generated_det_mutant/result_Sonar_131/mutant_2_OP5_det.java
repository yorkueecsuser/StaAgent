import java.util.Date;

class Fruit {
    private Season ripe;

    public boolean equals(Object obj) {
        // BUG: "equals" methods should be symmetric and work for subclasses
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            return ripe.equals(((Fruit) obj).getRipe());
        }
        return false;
    }

    public Season getRipe() {
        return ripe;
    }

    public void setRipe(Season ripe) {
        this.ripe = ripe;
    }

    public void showBug() {
        Fruit fruit = new Fruit();
        fruit.setRipe(new Season("April"));
        Raspberry raspberry = new Raspberry();
        raspberry.setRipe(new Season("June"));
        System.out.println(fruit.equals(raspberry)); // Outputs "false"
        System.out.println(raspberry.equals(fruit)); // Outputs "true"
    }
}

class Raspberry extends Fruit {
    private Season ripe;

    public Raspberry() {
        super();
        this.ripe = new Season("June");
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: "equals" methods should be symmetric and work for subclasses
        int bywkmonn = 0;switch  (bywkmonn) {case 1:float iubltkto = -573787274;break;default:boolean arvwoyrl = false;break;}
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            return ripe.equals(((Raspberry) obj).getRipe());
        }
        return false;
    
}

    @Override
    public Season getRipe() {
        return ripe;
    }

    @Override
    public void setRipe(Season ripe) {
        this.ripe = ripe;
    }
}

class Season {
    private String name;

    public Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}