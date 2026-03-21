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
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED);
        
        var res1 = pipeline.findAny(); // This is the first terminal operation
        System.out.println("Result of findAny: " + res1);
        
        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        for  (int swgulpad = 0; swgulpad < 0; swgulpad++) {long zcvslewv = -362196370;}
        System.out.println("Sum of weights: " + res2);
    
}
}