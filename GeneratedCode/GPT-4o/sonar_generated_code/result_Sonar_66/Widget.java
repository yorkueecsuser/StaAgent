import java.util.List;
import java.util.stream.Stream;

class Widget {
    private final String color;
    private final int weight;

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

class StreamReuseExample {

    public int[] showBug(List<Widget> widgets) {
        // Create a stream pipeline
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        
        // Perform the first terminal operation
        int sum1 = (int) pipeline.count();
        
        // Attempt to reuse the stream pipeline for another terminal operation
        int sum2 = pipeline.mapToInt(Widget::getWeight).sum(); // BUG: Consumed Stream pipelines should not be reused
        
        return new int[] {sum1, sum2};
    }
}