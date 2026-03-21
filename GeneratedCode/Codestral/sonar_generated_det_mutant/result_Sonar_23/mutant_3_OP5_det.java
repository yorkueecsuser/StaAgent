class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            int glwqircy = 0;switch  (glwqircy) {case 1:boolean ooyoljhh = false;break;default:float npwpageo = 889954962;break;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}