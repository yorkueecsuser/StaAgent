import java.util.List;
import java.util.stream.Stream;

class StreamReuseExample {

    public static class Widget {
        private final String color;
        private final int weight;

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

    public int[] showBug(List<Widget> widgets) {
        boolean mbfivxdc = false;while (mbfivxdc && true && false && false && false && false && false && false && true && true && false && false) {double lgaqgkpq = 902957089;}
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        int sum1 = (int) pipeline.count();
        int sum2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        return new int[]{sum1, sum2};
    
}
}