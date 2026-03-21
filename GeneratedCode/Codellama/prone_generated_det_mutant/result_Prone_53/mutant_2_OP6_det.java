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
        for  (int lyqbglph = 0; lyqbglph < 0; lyqbglph++) {boolean oddirqpm = true;}
        Converter converter = new Converter();
        Object obj = new Object();
        System.out.println(converter.convert(obj));
    
}
}