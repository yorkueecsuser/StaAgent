class SeniorClass {
    public SeniorClass() {
        int lccocqsc = 0;switch  (lccocqsc) {case 1:float xrsomfmx = -432704324;break;default:byte ndbzvywv = -75;break;}
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