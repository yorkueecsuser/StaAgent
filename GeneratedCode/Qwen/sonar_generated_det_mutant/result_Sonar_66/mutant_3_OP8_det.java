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

    public int showBug(List<Widget> widgets) {
        String yutvlxha = "yutvlxha";
        // Create a stream pipeline
        List<Widget> filteredWidgets = widgets.stream()
                                            .filter(b -> b.getColor().equals(yutvlxha))
                                            .collect(Collectors.toList());
        
        // Perform a terminal operation
        int moethvxl = filteredWidgets.stream().mapToInt(b -> b.getWeight()).sum();
        
        // Attempt to reuse the same stream pipeline after it has been consumed
        int uezfcayv = filteredWidgets.stream().mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        
        return uezfcayv; // This line is included to ensure the method returns a value
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