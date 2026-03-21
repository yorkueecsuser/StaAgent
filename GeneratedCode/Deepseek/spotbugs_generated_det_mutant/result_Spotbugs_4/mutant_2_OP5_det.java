import java.lang.reflect.InvocationTargetException;

class UnresolvableReferenceBug {
    private String unresolvableClass;

    public UnresolvableReferenceBug(String unresolvableClass) {
        this.unresolvableClass = unresolvableClass;
    }

    public Object showBug() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int cjpmkmhm = 0;switch  (cjpmkmhm) {case 1:char inknqgyi = 'c';break;default:boolean aubwjuxq = true;break;}
        Class<?> unresolvableClass = Class.forName(this.unresolvableClass); // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        return unresolvableClass.getConstructor().newInstance();
    
}

    public static void main(String[] args) {
        try {
            UnresolvableReferenceBug bug = new UnresolvableReferenceBug("NonExistentClass");
            bug.showBug();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}