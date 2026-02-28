import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamBug {

    private enum Color {RED, GREEN};

    private static class Widget {
        private Color color;
        private int weight;

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

    public static void main(String[] args) {
        List<Widget> widgets = Arrays.asList(
                new Widget(Color.RED, 1),
                new Widget(Color.GREEN, 2),
                new Widget(Color.RED, 3),
                new Widget(Color.GREEN, 4)
        );

        // Noncompliant code example
        showBug(widgets); // BUG: Intermediate Stream methods should not be left unused
    }

    public static int showBug(List<Widget> widgets) {
        // Noncompliant code example
        Stream<Widget> filteredWidgets = widgets.stream().filter(b -> b.getColor() == Color.RED); // BUG: Intermediate Stream methods should not be left unused
        return filteredWidgets.mapToInt(Widget::getWeight).sum();
    }
}