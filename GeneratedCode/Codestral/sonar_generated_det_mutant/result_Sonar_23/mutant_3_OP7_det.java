class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            boolean lndolnak = false;while (lndolnak && false && false && true && true && false && true && true && true && true && true && false) {float jeovvtul = 374469115;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}