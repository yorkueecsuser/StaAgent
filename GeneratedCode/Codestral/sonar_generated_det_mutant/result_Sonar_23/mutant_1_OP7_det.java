class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            boolean duwteacs = false;while (duwteacs && false && false && true && true && false && true && false && true && false && false && false) {boolean gucdhdqq = true;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}