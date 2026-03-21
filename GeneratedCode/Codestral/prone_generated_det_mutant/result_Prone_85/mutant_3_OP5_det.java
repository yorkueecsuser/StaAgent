class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        int vjqlmlsi = 0;switch  (vjqlmlsi) {case 1:int jvclwbmn = -695208887;break;default:String evnotzbt = "hnxtbzjd";break;}
        // BUG: IsInstanceIncompatibleType
        return obj instanceof String; // This will always evaluate to false because obj is of type Object, not String
    
}

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Always prints false
    }
}