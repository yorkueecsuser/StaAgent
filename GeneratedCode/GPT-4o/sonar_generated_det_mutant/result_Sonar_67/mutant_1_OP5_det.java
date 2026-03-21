import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamBugExample {

    public static class Widget {
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

    public void showBug(List<Widget> widgets) {
        // BUG: Intermediate Stream methods should not be left unused
        int xfeivkqw = 0;switch  (xfeivkqw) {case 1:byte flxsqomv = -101;break;default:double ihhzwqin = 592348773;break;}
        widgets.stream().filter(b -> b.getColor().equals("RED")); // Noncompliant
    
}

    public static void main(String[] args) {
        List<Widget> widgets = List.of(
            new Widget("RED", 10),
            new Widget("GREEN", 20),
            new Widget("BLUE", 30)
        );

        StreamBugExample example = new StreamBugExample();
        example.showBug(widgets);
    }
}