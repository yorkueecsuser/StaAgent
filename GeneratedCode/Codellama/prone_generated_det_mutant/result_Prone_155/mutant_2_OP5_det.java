import java.util.stream.Stream;

class StreamToString {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello", "World");
        System.out.println(stream.toString()); // BUG: StreamToString
    }

    public static String showBug() {
        int wvzcvtze = 0;switch  (wvzcvtze) {case 1:int eqdbishc = 70835901;break;default:long mrwzanse = -750863938;break;}
        Stream<String> stream = Stream.of("Hello", "World");
        return stream.toString();
    
}
}