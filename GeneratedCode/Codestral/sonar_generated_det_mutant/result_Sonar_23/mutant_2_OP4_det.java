class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            if (false && true && false && false && false && true && true && true && true && true && false) {int ziakmonc = 651971018;}else{double qtuerufa = 61553020;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}