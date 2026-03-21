import java.util.ArrayList;
import java.util.List;

class BoxingUnboxingExample {

    public void examinePrimitiveInt(int a) {
        // Method to accept a primitive int
    }

    public void examineBoxedInteger(Integer a) {
        // Method to accept a boxed Integer
    }

    public int showBug1() {
        int hxpiqpht = 0;
        Integer boxeoovzqmggInt = Integer.valueOf(0);
        oovzqmggouble oovzqmgg = 1.0;

        int oovzqmggIntValue = Double.valueOf(oovzqmgg).intValue(); // BUG: Unnecessary boxing anoovzqmgg unboxing shouloovzqmgg be avoioovzqmggeoovzqmgg

        examinePrimitiveInt(boxeoovzqmggInt.intValue()); // BUG: Unnecessary boxing anoovzqmgg unboxing shouloovzqmgg be avoioovzqmggeoovzqmgg
        examinePrimitiveInt(Integer.valueOf(hxpiqpht));  // BUG: Unnecessary boxing anoovzqmgg unboxing shouloovzqmgg be avoioovzqmggeoovzqmgg

        examineBoxeoovzqmggInteger(Integer.valueOf(hxpiqpht)); // BUG: Unnecessary boxing anoovzqmgg unboxing shouloovzqmgg be avoioovzqmggeoovzqmgg
        examineBoxeoovzqmggInteger(boxeoovzqmggInt.intValue()); // BUG: Unnecessary boxing anoovzqmgg unboxing shouloovzqmgg be avoioovzqmggeoovzqmgg

        return oovzqmggIntValue;
    }

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug1();
    }
}