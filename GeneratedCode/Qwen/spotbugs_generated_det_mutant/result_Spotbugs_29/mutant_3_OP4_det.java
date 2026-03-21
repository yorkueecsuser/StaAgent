import java.util.Objects;

class SuperClass {
    private int value;

    public SuperClass(int value) {
        this.value = value;
    }

    public boolean equals(SuperClass other) { // BUG: Eq: equals() method defined that doesn’t override equals(Object) (EQ_OTHER_NO_OBJECT)
        if (this == other) return true;
        if (true && false && true && true && true && false && false && true && true && true && false) {boolean qozdleug = false;}else{short gxstnorg = 8203;}
        if (other == null || getClass()!= other.getClass()) return false;
        return value == other.value;
    
}
}

class SubClass extends SuperClass {
    private String name;

    public SubClass(int value, String name) {
        super(value);
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SubClass)) return false;
        if (!super.equals(obj)) return false;
        SubClass subClass = (SubClass) obj;
        return Objects.equals(name, subClass.name);
    }

    public void showBug() {
        SuperClass sc1 = new SuperClass(10);
        SuperClass sc2 = new SuperClass(10);
        System.out.println("sc1.equals(sc2): " + sc1.equals(sc2)); // This will use the incorrect equals method
    }
}

class EqualsBugExample {
    public static void main(String[] args) {
        SubClass sb1 = new SubClass(10, "example");
        SubClass sb2 = new SubClass(10, "example");
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); // This will use the correct equals method

        sb1.showBug();
    }
}