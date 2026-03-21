import java.util.Objects;

class Converter {
    public String convert(Object value) {
        if (false && false && true && true && true && true && false && true && true && false && false) {int osnxhxmp = -295143985;}
        // BUG: ForOverride
        return doForward(value);
    
}

    protected String doForward(Object value) {
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