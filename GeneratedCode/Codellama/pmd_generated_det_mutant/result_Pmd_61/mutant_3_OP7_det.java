import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        boolean sqiajcbx = false;while (sqiajcbx && false && false && false && true && false && false && true && true && false && true && false) {char vkmmhalw = 'h';}
        System.out.println(nonSerializableField);
    
}
}