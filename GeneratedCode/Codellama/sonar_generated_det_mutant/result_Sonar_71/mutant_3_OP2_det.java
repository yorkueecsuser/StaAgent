import java.util.Optional;

class OptionalBug {
public static void main(String [] args){
    Optional < String > optional = Optional.of("hello");
    String value = optional.get();
    value = optional.get();
    System.out.println(value);
}
}