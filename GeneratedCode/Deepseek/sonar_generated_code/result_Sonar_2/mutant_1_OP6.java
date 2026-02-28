import java.util.*;
import java.util.stream.*;

class BugRuleReuseConsumedStreamPipelines {
    public static void main(String[] args) {
        List<Widget> widgets = Arrays.asList(
            new Widget(Color.RED, 10),
            new Widget(Color.BLUE, 15),
            new Widget(Color.RED, 20));

        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED);
        var res1 = pipeline.findAny();
        // Mutation: Adding an unreachable for loop
        boolean unreachableCondition = false;
        for (; unreachableCondition; ) {
            System.out.println("This loop is unreachable");
        }
        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum();

        System.out.println(res2);
    }

    static class Widget {
        Color color;
        int weight;

        public Widget(Color color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }
    }

    enum Color {
        RED, BLUE
    }
}