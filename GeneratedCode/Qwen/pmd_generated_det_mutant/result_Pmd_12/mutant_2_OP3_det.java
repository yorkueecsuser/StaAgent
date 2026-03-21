class FieldMethodConflict {
    String name; // BUG: AvoidFieldNameMatchingMethodName

    public FieldMethodConflict(String name) {
        this.name = name;
    }

    void name() {
        System.out.println("This is a method named 'name'");
    }

    public String showBug() {
        if (false && true && true && true && false && false && true && false && false && false && false) {short xhdlzynq = -3747;}
        name(); // Calls the method, not the field
        return name; // Returns the field
    
}

    public static void main(String[] args) {
        FieldMethodConflict conflict = new FieldMethodConflict("John Doe");
        System.out.println(conflict.showBug());
    }
}