class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    }
}