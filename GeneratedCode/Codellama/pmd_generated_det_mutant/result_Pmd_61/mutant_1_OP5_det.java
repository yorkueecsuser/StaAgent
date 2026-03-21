import java.io.Serializable;

// BUG: NonSerializableClass
class NonSerializableClassExample implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object nonSerializableField;

    public NonSerializableClassExample(Object nonSerializableField) {
        this.nonSerializableField = nonSerializableField;
    }

    public void showBug() {
        int bwvdwgcr = 0;switch  (bwvdwgcr) {case 1:short llylbrrk = 5280;break;default:byte ctavixke = -120;break;}
        System.out.println(nonSerializableField);
    
}
}