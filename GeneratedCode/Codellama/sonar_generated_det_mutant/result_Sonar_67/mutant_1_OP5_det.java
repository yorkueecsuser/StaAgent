import java.util.Arrays;
import java.util.stream.Stream;

class StreamBug {
    public static void main(String[] args) {
        Widget[] widgets = new Widget[5];
        widgets[0] = new Widget(1, "Red");
        widgets[1] = new Widget(2, "Green");
        widgets[2] = new Widget(3, "Blue");
        widgets[3] = new Widget(4, "Yellow");
        widgets[4] = new Widget(5, "Purple");

        // BUG: Intermediate Stream methods should not be left unused
        int wzwnexhp = 0;switch  (wzwnexhp) {case 1:double fkmlirnr = 529903600;break;default:double swsklsgk = 601738211;break;}
        Stream<Widget> stream = widgets.stream().filter(w -> w.getColor().equals("Red"));
    
}
}

class Widget {
    private int id;
    private String color;

    public Widget(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }
}