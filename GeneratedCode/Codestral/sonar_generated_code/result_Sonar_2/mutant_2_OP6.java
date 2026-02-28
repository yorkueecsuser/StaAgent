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

        // Beginning of mutated code
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This code will never execute");
        }
        // End of mutated code

        return pipeline.mapToInt(b -> b.getWeight()).sum(); // Bug: Reusing consumed pipeline // Noncompliant
    }

    public boolean getCondition() {
        return false;
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