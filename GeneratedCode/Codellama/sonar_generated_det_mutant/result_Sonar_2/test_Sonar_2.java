import org.junit.Assert;
import org.junit.Test;

class BuggyStreamTest {
    @Test
    public void testBug() {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.length() > 3).forEach(System.out::println);
        stream.forEach(System.out::println);
        Assert.assertTrue("Consumed Stream pipelines should not be reused", stream.isReused());
    }
}