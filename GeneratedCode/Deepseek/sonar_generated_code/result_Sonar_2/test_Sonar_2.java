import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
import java.util.stream.*;

public class BugRuleReuseConsumedStreamPipelinesTest {
    @Test
    public void testStreamConsumption() {
        // Given
        List<Widget> widgets = Arrays.asList(
            new Widget(Color.RED, 10),
            new Widget(Color.BLUE, 15),
            new Widget(Color.RED, 20));

        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Color.RED);

        // When
        Optional<Widget> res1 = pipeline.findAny();
        // TRIGGER BUG: Consumed Stream pipelines should not be reused
        int res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); 

        // Then
        assertTrue(res1.isPresent());
        assertEquals(res1.get().getWeight() + res2, 30);
    }

    static class Widget {
        Color color;
        int weight;

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

    enum Color {
        RED, BLUE
    }
}