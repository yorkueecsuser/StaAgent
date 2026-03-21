class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        for  (int ymuggydt = 0; ymuggydt < 0; ymuggydt++) {boolean ccjumunv = false;}
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    
}

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}