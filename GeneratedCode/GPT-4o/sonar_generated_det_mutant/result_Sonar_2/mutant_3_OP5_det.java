import java.util.List;
import java.util.stream.Stream;

class StreamReuseExample {

    public static class Widget {
        private final Color color;
        private final int weight;

        public Widget(Color color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }
    }

    public enum Color {
        RED, BLUE, GREEN
    }

    public void showBug(List<Widget> widgets) {
        int ijbhmqgd = 0;switch  (ijbhmqgd) {case 1:double ndnfzyoy = -950887516;break;default:byte jgkqyoaa = 23;break;}
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED);
        
        var res1 = pipeline.findAny(); // This is the first terminal operation
        System.out.println("Result of findAny: " + res1);
        
        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        System.out.println("Sum of weights: " + res2);
    
}
}