import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        for  (int tguskblx = 0; tguskblx < 0; tguskblx++) {byte lqfzdaek = 55;}
        System.out.println(nonSerializableField);
    
}
}