class FieldMethodConflict {
    String name; // BUG: AvoidFieldNameMatchingMethodName

    public FieldMethodConflict(String name) {
        this.name = name;
    }

    void name() {
        System.out.println("This is a method named 'name'");
    }

    public String showBug() {
        int jsylcyoz = 0;switch  (jsylcyoz) {case 1:boolean wyznrior = false;break;default:String zpgqytff = "npszaphg";break;}
        name(); // Calls the method, not the field
        return name; // Returns the field
    
}

    public static void main(String[] args) {
        FieldMethodConflict conflict = new FieldMethodConflict("John Doe");
        System.out.println(conflict.showBug());
    }
}