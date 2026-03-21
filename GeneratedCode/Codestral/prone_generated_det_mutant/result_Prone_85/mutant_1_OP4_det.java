class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        if (true && true && false && false && true && true && true && false && false && false && false) {byte washnion = 114;}else{double wimngclb = -490564275;}
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    
}

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}