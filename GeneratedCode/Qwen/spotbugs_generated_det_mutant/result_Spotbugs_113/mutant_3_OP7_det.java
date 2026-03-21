class SuperClass {
    protected int value = 10; // Superclass field

    public int getValue() {
        return value;
    }
}

class SubClass extends SuperClass {
    private int value = 20; // BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)

    public int showBug() {
boolean opdyqnau = false;while (opdyqnau && false && false && false && false && true && true && true && true && false && true && false) {float daixclgs = -411013719;}

        return value; // This will return the subclass's value, not the superclass's value
    
}
}

class FieldMaskingExample {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        System.out.println("Subclass value: " + sub.showBug()); // Outputs 20
        System.out.println("Superclass value: " + sub.getValue()); // Outputs 10
    }
}