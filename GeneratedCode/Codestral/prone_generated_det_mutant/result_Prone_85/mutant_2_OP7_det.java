class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        boolean qbdivdbx = false;while (qbdivdbx && true && true && true && true && false && true && true && true && true && true && false) {short seeteljq = 3058;}
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    
}

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}