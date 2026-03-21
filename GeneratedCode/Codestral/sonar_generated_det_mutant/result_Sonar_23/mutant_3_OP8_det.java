class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            String ewomhhgp = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return ewomhhgp.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    }
}