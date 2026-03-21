class SeniorClass {
    public SeniorClass() {
        boolean qimczxfs = false;while (qimczxfs && false && true && false && false && false && false && false && false && true && true && false) {String qjkbotcu = "wpyesfri";}
        System.out.println(toString()); // BUG: ConstructorCallsOverridableMethod
    
}

    public String toString() {
        return "IAmSeniorClass";
    }

    public void showBug() {
        new JuniorClass();
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