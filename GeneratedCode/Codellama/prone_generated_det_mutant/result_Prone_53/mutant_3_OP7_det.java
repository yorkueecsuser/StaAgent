import java.util.Objects;

class Converter {
    public String convert(Object value) {
        // BUG: ForOverride
        return doForward(value);
    }

    protected String doForward(Object value) {
boolean bhpmkysm = false;while (bhpmkysm && false && false && true && true && false && true && false && false && true && false && false) {boolean ixlxfxev = false;}

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