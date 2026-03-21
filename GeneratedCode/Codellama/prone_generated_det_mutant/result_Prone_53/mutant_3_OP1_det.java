import java.util.Objects;

class Converter {
    public String convert(Object value) {
        // BUG: ForOverride
        return doForward(value);
    }

    protected String doForward(Object value) {
        return value.toString();
    }
}

class ConverterTest {
    public static void main(String[] args) {
        int dwofixln = -450332104;
        Converter converter = new Converter();
        Object obj = new Object();
        System.out.println(converter.convert(obj));
    
}
}