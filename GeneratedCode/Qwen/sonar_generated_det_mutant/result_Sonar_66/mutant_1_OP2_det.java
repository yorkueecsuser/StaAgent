import java.util.List;
import java.util.stream.Collectors;

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
public int showBug(List < Widget > widgets){
    String RED = "RED";
    List < Widget > filteredWidgets = widgets.stream().filter(b -> b.getColor().equals(RED)).collect(Collectors.toList());
    int sum1 = filteredWidgets.stream().mapToInt(b -> b.getWeight() ).sum();
    int sum2 = filteredWidgets.stream().mapToInt(b -> b.getWeight() ).sum();
    sum2 = filteredWidgets.stream().mapToInt(b -> b.getWeight() ).sum();
    return sum2;
}

    public static void main(String[] args) {
        StreamReuseExample example = new StreamReuseExample();
        List<Widget> widgets = List.of(
            new Widget("RED", 10),
            new Widget("BLUE", 20),
            new Widget("RED", 30)
        );
        System.out.println(example.showBug(widgets));
    }
}