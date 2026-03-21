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
        Converter converter = new Converter();
        Object obj = new Object();
        int ivqanwnb = 0;switch  (ivqanwnb) {case 1:float bspihonu = -40952024;break;default:String xyrhmzpg = "ieyqgryc";break;}
        System.out.println(converter.convert(obj));
    
}
}