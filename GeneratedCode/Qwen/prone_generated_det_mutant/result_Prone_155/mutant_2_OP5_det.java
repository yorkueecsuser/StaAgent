import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> stream = list.stream();
        int mwjhlfve = 0;switch  (mwjhlfve) {case 1:String peutxccl = "lqohvegh";break;default:float vorpsqsq = -209256785;break;}
        String streamAsString = stream.toString(); // BUG: StreamToString
        return streamAsString;
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}