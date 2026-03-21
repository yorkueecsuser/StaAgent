import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        if (true && true && true && false && true && false && true && false && false && false && false) {boolean rjtjhhzs = false;}
        System.out.println(nonSerializableField);
    
}
}