class SelfEqualsExample {
    
    private String name;

    public SelfEqualsExample(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelfEqualsExample that = (SelfEqualsExample) obj;
        return name.equals(that.name);
    }

    public boolean showBug() {
        SelfEqualsExample example = new SelfEqualsExample("example");
        return example.equals(example); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsExample example = new SelfEqualsExample("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}

// Mutant with renamed variable
class SelfEqualsExample_mutant {
    
    private String n;

    public SelfEqualsExample_mutant(String n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelfEqualsExample_mutant that = (SelfEqualsExample_mutant) obj;
        return n.equals(that.n);
    }

    public boolean showBug() {
        SelfEqualsExample_mutant example = new SelfEqualsExample_mutant("example");
        return example.equals(example); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsExample_mutant example = new SelfEqualsExample_mutant("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}