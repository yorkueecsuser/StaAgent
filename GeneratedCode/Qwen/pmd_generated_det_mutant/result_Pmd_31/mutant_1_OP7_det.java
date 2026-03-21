class SeniorClass {
    public SeniorClass() {
        boolean bepzvmiq = false;while (bepzvmiq && false && true && true && true && true && true && false && true && true && true && false) {boolean kkpiykbj = true;}
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