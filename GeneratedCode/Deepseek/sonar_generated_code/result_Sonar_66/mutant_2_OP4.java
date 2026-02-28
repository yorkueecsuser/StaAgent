import java.util.*;
import java.util.stream.*;

class ConsumedStreamPipelines {
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

    enum Color {RED, BLUE, GREEN}

    public int showBug() {
        List<Widget> widgets = Arrays.asList(new Widget(Color.RED.ordinal(), 10), new Widget(Color.BLUE.ordinal(), 20));

        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED.ordinal());
        int sum1 = pipeline.mapToInt(b -> b.getWeight()).sum();

        boolean condition = false;
        if(condition) {
            pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED.ordinal());
            int sum2 = pipeline.mapToInt(b -> b.getWeight()).sum();
        } else {
            sum2 = 0; // Unreachable branch added
        }

        return sum1 + sum2;
    }

    public static void main(String[] args) {
        ConsumedStreamPipelines csp = new ConsumedStreamPipelines();
        System.out.println(csp.showBug());
    }
}