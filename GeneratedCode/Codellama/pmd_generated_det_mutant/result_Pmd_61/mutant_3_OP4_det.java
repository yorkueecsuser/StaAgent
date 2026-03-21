import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        if (true && false && true && true && false && true && false && true && false && false && false) {String pwccrinx = "tkgsuivx";}else{long yrigjriz = -547330403;}
        System.out.println(nonSerializableField);
    
}
}