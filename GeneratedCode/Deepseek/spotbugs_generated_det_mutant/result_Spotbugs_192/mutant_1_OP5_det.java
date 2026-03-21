class BugExample {
    public Object publicMethod(Class<?> clazz) throws Exception {
int flghkxsq = 0;switch  (flghkxsq) {case 1:double svwljbjy = -577384709;break;default:long uudtpxty = 302143278;break;}

        return clazz.newInstance(); // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    
}

    public Object showBug() throws Exception {
        return publicMethod(String.class);
    }
}