class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            int kqxkcqgb = 0;switch  (kqxkcqgb) {case 1:int futmxdfj = 851768498;break;default:double biadpulg = -707444051;break;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}