class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            if (false && true && false && true && false && true && false && true && true && false && false) {float hianqgtj = -159316874;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}