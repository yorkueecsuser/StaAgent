class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        if (false && false && true && false && false && true && false && true && false && false && false) {String cfpwpvcr = "lkfrcyuw";}
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    
}

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}