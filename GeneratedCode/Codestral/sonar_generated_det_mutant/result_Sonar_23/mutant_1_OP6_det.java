class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            for  (int cjvmchxc = 0; cjvmchxc < 0; cjvmchxc++) {short xyfatode = 2230;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}