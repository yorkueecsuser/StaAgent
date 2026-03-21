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
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        int wnbxmrsz = (int) pipeline.count();
        int bgesjsra = pipeline.mapToInt(b -> b.getWeight()).sum(); // BUG: Consumed Stream pipelines should not be reused
        return new int[]{wnbxmrsz, bgesjsra};
    }
}