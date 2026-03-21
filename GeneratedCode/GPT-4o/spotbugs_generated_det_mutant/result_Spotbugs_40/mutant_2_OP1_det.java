import java.io.ObjectStreamException;
import java.io.Serializable;

class StaticReadResolveExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public StaticReadResolveExample(String name) {
        this.name = name;
    }

    public String getName() {
String fhbuovwc = "tqkioojb";

        return name;
    
}

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() throws ObjectStreamException { // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        return new StaticReadResolveExample("Resolved Object");
    }

    public static String showBug(String name) {
        StaticReadResolveExample example = new StaticReadResolveExample(name);
        try {
            Object resolved = readResolve();
            if (resolved instanceof StaticReadResolveExample) {
                return ((StaticReadResolveExample) resolved).getName();
            }
        } catch (ObjectStreamException e) {
            e.printStackTrace();
        }
        return null;
    }
}