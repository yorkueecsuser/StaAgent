import java.util.*;
import java.util.stream.*;

class ConsumedStreamPipelines {
    // A Widget class to demonstrate the bug
    class Widget {
        int color;
        int weight;

        Widget(int color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        int getColor() {
            return color;
        }

        int getWeight() {
            return weight;
        }
    }

    // Enumeration for color to make the code more readable
    enum Color {RED, BLUE, GREEN}

    // A method to demonstrate the bug
    public int showBug() {
        List<Widget> widgets = Arrays.asList(new Widget(Color.RED.ordinal(), 10), new Widget(Color.BLUE.ordinal(), 20));

        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED.ordinal());
        int sum1 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused

        boolean condition1 = false;
        if (condition1) { // Mutation Operator: Unreachable for loop
            for (int i = 0; i < 10; i++) {
                System.out.println("This loop is unreachable.");
            }
        }

        pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED.ordinal());
        int sum2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused

        boolean condition2 = false;
        if (condition2) { // Mutation Operator: Unreachable for loop
            for (int i = 0; i < 10; i++) {
                System.out.println("This loop is unreachable.");
            }
        }

        return sum1 + sum2;
    }

    public static void main(String[] args) {
        ConsumedStreamPipelines csp = new ConsumedStreamPipelines();
        System.out.println(csp.showBug());
    }
}