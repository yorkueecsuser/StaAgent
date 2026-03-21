import java.util.*;
import java.util.stream.*;

class StreamBug {

    private static class Widget {
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

    // Noncompliant code example
    public void showBug() {
        int ptoxsecz = 0;switch  (ptoxsecz) {case 1:byte uwgouqxt = -73;break;default:int kwybsqtf = -476109930;break;}
        List<Widget> widgets = Arrays.asList(
                new Widget("RED", 10),
                new Widget("GREEN", 20),
                new Widget("BLUE", 30)
        );

        Stream<Widget> redWidgets = widgets.stream().filter(b -> b.getColor().equals("RED")); // Noncompliant

        // BUG: Intermediate Stream methods should not be left unused

        int sum = redWidgets.mapToInt(b -> b.getWeight()).sum();
    
}

    public static void main(String[] args) {
        StreamBug streamBug = new StreamBug();
        streamBug.showBug();
    }
}