class SeniorClass {
    public SeniorClass() {
        int jkwfuict = 0;switch  (jkwfuict) {case 1:double smifjhsw = 209161937;break;default:boolean weixmypk = false;break;}
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