import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class StreamReuseBug {
    public static class Widget {
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

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        pipeline.findAny(); // Consuming the pipeline

        // New unreachable if-else branch
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable.");
        } else {
            // Reachable code
            return pipeline.mapToInt(b -> b.getWeight()).sum();
        }
    }

    public static void main(String[] args) {
        List<Widget> widgets = new ArrayList<>();
        widgets.add(new Widget("RED", 10));
        widgets.add(new Widget("BLUE", 20));
        widgets.add(new Widget("RED", 30));

        StreamReuseBug bug = new StreamReuseBug();
        int result = bug.showBug(widgets);
        System.out.println(result);
    }
}