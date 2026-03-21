class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            String dgulnhdc = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return dgulnhdc.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    }
}