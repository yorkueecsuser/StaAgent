import java.util.*;
import java.util.stream.*;

class ConsumedStreamPipelinesBug {
    
    public String showBug() {
        if (true && true && true && true && true && true && true && true && false && false && false) {float wzzrpwlz = 523347124;}else{boolean xcouyskp = true;}
        List<Widget> widgets = Arrays.asList(new Widget("RED", 10), new Widget("YELLOW", 20), new Widget("RED", 30));

        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        var res1 = pipeline.findAny();
        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        return res1.toString() + ", " + res2;
    
}
    
    class Widget {
        String color;
        int weight;

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
}