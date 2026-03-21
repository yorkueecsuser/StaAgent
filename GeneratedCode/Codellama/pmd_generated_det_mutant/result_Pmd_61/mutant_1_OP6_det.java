import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        for  (int cvgurqex = 0; cvgurqex < 0; cvgurqex++) {double ettfkebx = 192900398;}
        System.out.println(nonSerializableField);
    
}
}