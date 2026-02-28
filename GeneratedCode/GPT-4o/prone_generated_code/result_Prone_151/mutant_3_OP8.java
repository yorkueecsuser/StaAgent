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

// Mutant 1: Renaming the variable 'name' to 'd' in the constructor and equals method
class SelfEqualsExampleMutant1 {

    private String d; // renamed 'name' to 'd'

    public SelfEqualsExampleMutant1(String d) { // renamed parameter 'name' to 'd'
        this.d = d; // renamed 'name' to 'd'
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelfEqualsExampleMutant1 that = (SelfEqualsExampleMutant1) obj;
        return d.equals(that.d); // renamed 'name' to 'd'
    }

    public boolean showBug() {
        SelfEqualsExampleMutant1 example = new SelfEqualsExampleMutant1("example");
        return example.equals(example); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsExampleMutant1 example = new SelfEqualsExampleMutant1("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}