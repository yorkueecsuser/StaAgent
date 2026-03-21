class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            for  (int cvkxthvo = 0; cvkxthvo < 0; cvkxthvo++) {double vefkndae = -923058004;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}