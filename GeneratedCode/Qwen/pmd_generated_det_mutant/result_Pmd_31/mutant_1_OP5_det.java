class SeniorClass {
    public SeniorClass() {
        int rgnmrltu = 0;switch  (rgnmrltu) {case 1:double xlnwogti = 218954881;break;default:char xechjjnt = 'f';break;}
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