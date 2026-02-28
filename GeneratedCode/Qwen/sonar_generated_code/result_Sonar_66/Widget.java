import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Widget {
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

class StreamReuseExample {

    public List<Integer> showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(w -> w.getColor().equals("RED"));
        int sum1 = (int) pipeline.count(); // This consumes the stream // BUG: Consumed Stream pipelines should not be reused
        int sum2 = pipeline.mapToInt(w -> w.getWeight()).sum(); // This line will cause an IllegalStateException due to reusing the stream
        return Arrays.asList(sum1, sum2);
    }

    public static void main(String[] args) {
        StreamReuseExample example = new StreamReuseExample();
        List<Widget> widgets = Arrays.asList(
            new Widget("RED", 10),
            new Widget("BLUE", 20),
            new Widget("RED", 30)
        );
        System.out.println(example.showBug(widgets));
    }
}