import java.util.Objects;

class Converter {
    public String convert(Object value) {
        int xwdjdjbu = 0;switch  (xwdjdjbu) {case 1:long yhsdopgk = -738740869;break;default:int yvxwrqun = 802432420;break;}
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