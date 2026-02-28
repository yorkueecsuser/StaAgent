import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class StreamReuseExample {

    public static class Widget {
        private String color;
        private int weight;

        public Widget(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }
    }

    public int showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        Optional<Widget> res1 = pipeline.findAny(); // This consumes the stream
        int res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        return res2;
    }

    public static void main(String[] args) {
        StreamReuseExample example = new StreamReuseExample();
        List<Widget> widgets = List.of(new Widget("RED", 10), new Widget("BLUE", 20), new Widget("RED", 30));
        try {
            int result = example.showBug(widgets);
            System.out.println("Sum of weights: " + result);
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}