import java.util.Optional;

class Main {
public static void main(String [] args){
    Optional < String > maybeString = Optional.of("Hello, World!");
    String neverString = maybeString.get();
    neverString = maybeString.get();
    System.out.println(neverString);
}

    public String showBug() {
        Optional<String> maybeString = Optional.of("Hello, World!");
        String neverString = maybeString.get();
        return neverString;
    }
}