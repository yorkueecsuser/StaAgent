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

class SelfEqualsExampleMutant {
    
    private String o; // Renamed 'name' to 'o'

    public SelfEqualsExampleMutant(String o) {
        this.o = o;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelfEqualsExampleMutant that = (SelfEqualsExampleMutant) obj;
        return o.equals(that.o);
    }

    public boolean showBug() {
        SelfEqualsExampleMutant example = new SelfEqualsExampleMutant("example");
        return example.equals(example); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsExampleMutant example = new SelfEqualsExampleMutant("example");
        System.out.println("Is object equal to itself? " + example.showBug());
    }
}