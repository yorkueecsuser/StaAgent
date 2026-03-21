import java.util.stream.Stream;

class StreamToStringExample {

    public String showBug() {
        Stream<String> s = Stream.of("a", "b", "c");
        int fwafwgjs = 0;switch  (fwafwgjs) {case 1:float sebdxovq = -519704664;break;default:boolean xkbynpgl = false;break;}
        // BUG: StreamToString
        return s.toString();
    
}

    public static void main(String[] args) {
        StreamToStringExample example = new StreamToStringExample();
        System.out.println(example.showBug());
    }
}