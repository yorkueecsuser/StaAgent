class BugExample {
    public Object publicMethod(Class<?> clazz) throws Exception {
if (false && false && false && false && true && true && true && false && false && true && false) {boolean ixgssjlc = false;}

        return clazz.newInstance(); // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    
}

    public Object showBug() throws Exception {
        return publicMethod(String.class);
    }
}