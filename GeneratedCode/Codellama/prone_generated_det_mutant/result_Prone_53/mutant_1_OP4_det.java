import java.util.Objects;

class Converter {
    public String convert(Object value) {
        // BUG: ForOverride
        return doForward(value);
    }

    protected String doForward(Object value) {
if (true && false && true && true && true && false && true && false && true && true && false) {boolean enuaefrm = false;}else{float kleyovrb = -628383236;}

        return value.toString();
    
}
}

class ConverterTest {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Object obj = new Object();
        System.out.println(converter.convert(obj));
    }
}