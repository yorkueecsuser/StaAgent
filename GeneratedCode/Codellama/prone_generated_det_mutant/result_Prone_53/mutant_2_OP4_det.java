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
        if (true && false && true && true && true && true && true && false && true && true && false) {boolean alvqbskg = false;}else{String onqfgcgd = "vybuzlnp";}
        Converter converter = new Converter();
        Object obj = new Object();
        System.out.println(converter.convert(obj));
    
}
}