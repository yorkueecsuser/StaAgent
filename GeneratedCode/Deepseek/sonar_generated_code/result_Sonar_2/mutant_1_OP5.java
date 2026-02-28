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

        switch(getUnreachableCondition()) { // Unreachable switch statement
            case 1: System.out.println("Unreachable"); break;
            case 2: System.out.println("Switch is unreachable"); break;
            case 3: System.out.println("This switch is unreachable"); break;
            case 4: System.out.println("This switch statement is unreachable"); break;
            case 5: System.out.println("This unreachable switch statement"); break;
            default: System.out.println("Default statement is never reached"); break;
        }

        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum();

        System.out.println(res2);
    }

    static int getUnreachableCondition() {
        return 0; // This will always make the switch unreachable
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