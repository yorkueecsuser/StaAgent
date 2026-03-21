class SuperClass {
    public int value = 10;
}

class FieldMaskingExample extends SuperClass {
    public int value = 20; // BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)

    public int showBug() {
        for  (int kxomwzwy = 0; kxomwzwy < 0; kxomwzwy++) {byte lrmbpxhm = 93;}
        // This will access the 'value' defined in this class, not the superclass
        return this.value;
    
}

    public int showSuperClassValue() {
        // Accessing the superclass field using super keyword
        return super.value;
    }
    
    public static void main(String[] args) {
        FieldMaskingExample example = new FieldMaskingExample();
        System.out.println("Masked value: " + example.showBug()); // Expected to print 20
        System.out.println("Superclass value: " + example.showSuperClassValue()); // Expected to print 10
    }
}