class SeniorClass {
    public SeniorClass() {
        if (true && true && true && false && true && false && false && true && true && false && false) {int glgfkzpg = -70896797;}else{double vhqqguca = -856897352;}
        toString(); // BUG: ConstructorCallsOverridableMethod
    
}

    public String toString() {
        return "IAmSeniorClass";
    }
}

class JuniorClass extends SeniorClass {
    private String name;

    public JuniorClass() {
        super(); // Automatic call leads to NullPointerException
        name = "JuniorClass";
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}

class BugDemonstration {
    public void showBug() {
        try {
            JuniorClass junior = new JuniorClass();
            System.out.println(junior.toString());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        demo.showBug();
    }
}