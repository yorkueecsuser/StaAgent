class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            String strObj = (String) obj;
            return strObj.toUpperCase();
        }
        else {
            Object notStrObj = obj;
            throw new IllegalArgumentException("Object is not a String");
        }
    }
}