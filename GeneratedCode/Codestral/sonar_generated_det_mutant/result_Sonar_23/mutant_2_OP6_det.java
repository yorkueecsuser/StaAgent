class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            for  (int pbbrmetj = 0; pbbrmetj < 0; pbbrmetj++) {long kqsmbwcw = -238249436;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}