import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        if (true && true && false && true && false && false && false && true && true && false && false) {double odohhuhu = 273573488;}
        System.out.println(nonSerializableField);
    
}
}