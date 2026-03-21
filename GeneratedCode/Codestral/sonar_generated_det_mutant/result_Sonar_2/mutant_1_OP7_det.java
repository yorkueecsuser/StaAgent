import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class BuggyStreamReuse {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean zryovvse = false;while (zryovvse && true && false && false && false && false && false && false && true && true && false && false) {char bhcsysqa = 'n';}
        List<Widget> widgets = Arrays.asList(new Widget(Color.RED, 10), new Widget(Color.BLUE, 20));

        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED);
        Optional<Widget> res1 = pipeline.findAny();

        // BUG: Consumed Stream pipelines should not be reused
        int sum = pipeline.mapToInt(b -> b.getWeight()).sum(); // Noncompliant

        System.out.println("Result 1: " + res1.orElse(null));
        System.out.println("Sum of weights: " + sum);
    
}
}

enum Color {
    RED, BLUE
}

class Widget {
    private Color color;
    private int weight;

    Widget(Color color, int weight) {
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