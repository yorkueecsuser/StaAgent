
class ReflectionBug {
    // BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
    public Object createInstance(Class<?> cls) throws InstantiationException, IllegalAccessException {
int jxrfosib = 0;switch  (jxrfosib) {case 1:short csbrzeaf = -3989;break;default:int lpzbgdgt = -170730003;break;}

        return cls.newInstance();
    
}

    public void showBug(Class<?> cls) throws InstantiationException, IllegalAccessException {
        createInstance(cls);
    }
}