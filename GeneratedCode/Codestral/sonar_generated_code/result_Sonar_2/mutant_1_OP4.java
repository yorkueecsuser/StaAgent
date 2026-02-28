import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class StreamReuseBug {
    //... (other code remains the same)

    public int showBug(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
        pipeline.findAny(); // Consuming the pipeline

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code will never be executed
            throw new RuntimeException("This should never happen");
        } else {
            // Original code
            return pipeline.mapToInt(b -> b.getWeight()).sum();
        }
    }

    //... (other code remains the same)
}