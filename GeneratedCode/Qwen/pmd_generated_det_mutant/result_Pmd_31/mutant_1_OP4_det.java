class SeniorClass {
    public SeniorClass() {
        if (true && true && false && true && false && false && true && true && true && false && false) {boolean oposxtwi = true;}else{long wbgwofyc = 731328258;}
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