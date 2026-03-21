class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        int mfqrxsin = 0;switch  (mfqrxsin) {case 1:byte jmkzxvqg = 52;break;default:short rztdshdi = 5886;break;}
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    
}

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}