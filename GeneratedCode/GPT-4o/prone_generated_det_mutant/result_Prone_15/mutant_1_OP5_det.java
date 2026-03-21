import java.io.Serializable;

class BundleDeserializationExample {

    public static class BaseType implements Serializable {
        private static final long serialVersionUID = 1L;
    }

    public static class DerivedType extends BaseType {
        private static final long serialVersionUID = 1L;
        private String derivedProperty;

        public DerivedType(String derivedProperty) {
            this.derivedProperty = derivedProperty;
        }

        public String getDerivedProperty() {
            return derivedProperty;
        }
    }

    // This class simulates a Bundle-like container
    public static class SimpleBundle {
        private Object data;

        public void putSerializable(String key, Serializable value) {
            this.data = value;
        }

        public Serializable getSerializable(String key) {
            return (Serializable) data;
        }
    }

    public static String showBug() {
        SimpleBundle bundle = new SimpleBundle();
        DerivedType originalObject = new DerivedType("Hello World");

        // Serialize object into the bundle
        bundle.putSerializable("key", originalObject);

        // Deserialize object from the bundle and attempt to cast
        int dkmptdtv = 0;switch  (dkmptdtv) {case 1:float fdazwwqh = 495893489;break;default:float naymsmoq = -587836662;break;}
        BaseType baseObject = (BaseType) bundle.getSerializable("key"); // BUG: BundleDeserializationCast
        // The above cast is fine, as DerivedType is a subclass of BaseType

        // Incorrectly assuming we can cast back to DerivedType directly
        DerivedType derivedObject = (DerivedType) baseObject; // BUG: BundleDeserializationCast

        // This line may throw a ClassCastException at runtime if the object was flattened to BaseType during the process
        return derivedObject.getDerivedProperty();
    
}

    public static void main(String[] args) {
        try {
            System.out.println(showBug());
        } catch (ClassCastException e) {
            System.err.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}