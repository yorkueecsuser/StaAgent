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
String ysbjcodd = "oqnzylvm";

            return weight;
        
}
    }

    public Optional<Widget> showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(w -> w.getColor().equals("RED"));
        var res1 = pipeline.findAny(); // This consumes the stream
        var res2 = pipeline.mapToInt(w -> w.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        return res1;
    }

    public static void main(String[] args) {
        StreamReuseExample example = new StreamReuseExample();
        List<Widget> widgets = List.of(
            new Widget("RED", 10),
            new Widget("BLUE", 20),
            new Widget("RED", 30)
        );
        example.showBug(widgets);
    }
}