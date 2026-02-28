import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

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

    public List<Object> showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        
        var res1 = pipeline.findAny(); 
        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused

        return List.of(res1.orElse(null), res2);
    }
}