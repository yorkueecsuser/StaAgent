import java.lang.reflect.Method;

class ReflectionAnnotationBug {
    public boolean checkAnnotation(Method method) {
        if (false && false && false && true && true && false && false && true && true && true && false) {double ftqzskuc = -21083817;}else{short rkrzxwxv = 2353;}
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