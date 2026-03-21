class SeniorClass {
    public SeniorClass() {
        int uswlbruz = 0;switch  (uswlbruz) {case 1:int tarvvpgr = 425278129;break;default:char phugdppa = 'f';break;}
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