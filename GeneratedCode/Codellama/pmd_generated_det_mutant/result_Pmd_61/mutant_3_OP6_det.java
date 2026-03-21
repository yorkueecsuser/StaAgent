import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        for  (int abgjambq = 0; abgjambq < 0; abgjambq++) {byte ajekxdae = 76;}
        System.out.println(nonSerializableField);
    
}
}