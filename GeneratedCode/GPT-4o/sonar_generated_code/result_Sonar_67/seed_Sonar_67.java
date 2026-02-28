import java.util.List;
import java.util.stream.Collectors;

class StreamBugDemo {
    
    // Widget class for demonstration purposes
    static class Widget {
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

    public void showBug(List<Widget> widgets) {
        // BUG: Intermediate Stream methods should not be left unused
        widgets.stream().filter(widget -> widget.getColor().equals("RED")); // BUG: Intermediate Stream methods should not be left unused
    }

    public static void main(String[] args) {
        List<Widget> widgets = List.of(
            new Widget("RED", 10),
            new Widget("GREEN", 20),
            new Widget("BLUE", 30)
        );
        
        StreamBugDemo demo = new StreamBugDemo();
        demo.showBug(widgets);
    }
}