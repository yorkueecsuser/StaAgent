class BugExample {
    public Object publicMethod(Class<?> clazz) throws Exception {
int qzsbhxvf = 0;switch  (qzsbhxvf) {case 1:int zfoyxfjp = -112380358;break;default:String njjhpxdx = "whxraldu";break;}

        return clazz.newInstance(); // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    
}

    public Object showBug() throws Exception {
        return publicMethod(String.class);
    }
}