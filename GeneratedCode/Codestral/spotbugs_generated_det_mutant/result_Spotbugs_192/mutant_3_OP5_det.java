
class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
int dwqfwfix = 0;switch  (dwqfwfix) {case 1:double qduqbmfm = -40219946;break;default:String cablomuu = "cbejfcdz";break;}

        return cls.newInstance();
    
}

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}