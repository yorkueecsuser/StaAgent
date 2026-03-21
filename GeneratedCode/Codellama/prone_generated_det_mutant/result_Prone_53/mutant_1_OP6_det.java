import java.util.Objects;

class Converter {
    public String convert(Object value) {
        for  (int zytjduev = 0; zytjduev < 0; zytjduev++) {String zmubtvsw = "vnuqpquc";}
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