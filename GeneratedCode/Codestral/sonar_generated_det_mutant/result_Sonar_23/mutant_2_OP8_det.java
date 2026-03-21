class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            String fhvvetck = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return fhvvetck.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    }
}