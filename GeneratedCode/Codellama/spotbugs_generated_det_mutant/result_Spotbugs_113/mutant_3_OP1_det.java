import java.util.ArrayList;

class MF_CLASS_MASKS_FIELD {
    private int field;

    public MF_CLASS_MASKS_FIELD(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public static void main(String[] args) {
        MF_CLASS_MASKS_FIELD obj = new MF_CLASS_MASKS_FIELD(5);
        boolean btkczwmk = true;
        System.out.println(obj.getField()); // BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
    
}
}