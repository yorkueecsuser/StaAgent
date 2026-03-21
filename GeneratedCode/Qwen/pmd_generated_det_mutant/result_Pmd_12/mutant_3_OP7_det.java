class FieldMethodConflict {
    String name; // BUG: AvoidFieldNameMatchingMethodName

    public FieldMethodConflict(String name) {
        this.name = name;
    }

    void name() {
        System.out.println("This is a method named 'name'");
    }

    public String showBug() {
        boolean ssjpecbu = false;while (ssjpecbu && true && true && false && true && true && true && true && false && true && false && false) {long chzvgsyl = -168970776;}
        name(); // Calls the method, not the field
        return name; // Returns the field
    
}

    public static void main(String[] args) {
        FieldMethodConflict conflict = new FieldMethodConflict("John Doe");
        System.out.println(conflict.showBug());
    }
}