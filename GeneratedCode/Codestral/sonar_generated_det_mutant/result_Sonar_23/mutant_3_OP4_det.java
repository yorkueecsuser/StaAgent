class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            if (true && true && true && false && true && false && false && true && true && true && false) {float rqmjjzye = -701151836;}else{char bbwaukew = 'q';}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}