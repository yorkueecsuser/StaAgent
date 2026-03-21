class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            if (true && true && false && true && true && true && true && false && false && false && false) {short dhzqzqtf = 1843;}else{float iahzcdbd = -836661052;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}