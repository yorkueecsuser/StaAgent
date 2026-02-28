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

    public int showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        pipeline.findAny(); // Consuming the pipeline

        // Inserting unreachable switch statement
        boolean shouldRun = false;
        int value = getValue();
        switch (value) {
            case 1:
                if (shouldRun) {
                    /* Unreachable code */
                }
                break;
            // Add more cases if needed
        }

        return pipeline.mapToInt(b -> b.getWeight()).sum(); // Bug: Reusing consumed pipeline // Noncompliant
    }

    // Method to get a dynamic value for the switch condition
    private int getValue() {
        return 0; // Always returns 0, making the switch statement unreachable
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