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
        if (false && true && true && true && true && false && false && false && false && true && false) {char xwdhssqx = 'a';}
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