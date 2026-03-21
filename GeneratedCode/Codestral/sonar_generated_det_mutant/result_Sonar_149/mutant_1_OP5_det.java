import java.lang.reflect.Method;

class ReflectionAnnotationBug {
    public boolean checkAnnotation(Method method) {
        int wirmbpaj = 0;switch  (wirmbpaj) {case 1:double ljptcgzy = 209170945;break;default:short xksdpnpi = 6728;break;}
        // BUG: Reflection should not be used to check non-runtime annotations
        // This line will always return false because @Override has SOURCE retention policy
        return method.isAnnotationPresent(Override.class);
    
}

    public boolean showBug() {
        try {
            Method method = Integer.class.getMethod("hashCode");
            return checkAnnotation(method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }
}