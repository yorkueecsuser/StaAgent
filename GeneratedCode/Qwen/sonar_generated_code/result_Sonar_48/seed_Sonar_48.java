import java.util.Arrays;
import java.util.List;

class AssertJBugExample {

    public boolean showBug1(List<String> logs) {
        return assertThat(logs).allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }

    public boolean showBug2(List<String> logs) {
        return assertThat(logs).doesNotContain("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }

    public void showBug() {
        System.out.println(showBug1(Arrays.asList())); // Should return true, but it's a bug
        System.out.println(showBug2(Arrays.asList())); // Should return true, but it's a bug
    }

    private static <T> AbstractAssert<?, List<T>> assertThat(List<T> actual) {
        return new ListAssert<>(actual);
    }

    private static class ListAssert<T> extends AbstractAssert<ListAssert<T>, List<T>> {

        protected ListAssert(List<T> actual) {
            super(actual, ListAssert.class);
        }

        public ListAssert<T> allMatch(java.util.function.Predicate<? super T> predicate) {
            isNotNull();
            if (!actual.stream().allMatch(predicate)) {
                failWithMessage("Expecting all elements to match the given predicate but at least one did not.");
            }
            return this;
        }

        public ListAssert<T> doesNotContain(T value) {
            isNotNull();
            if (actual.contains(value)) {
                failWithMessage("Expecting <%s> not to contain <%s>", actual, value);
            }
            return this;
        }
    }

    private abstract static class AbstractAssert<S extends AbstractAssert<S, A>, A> {
        protected final A actual;
        protected final S myself;

        @SuppressWarnings("unchecked")
        protected AbstractAssert(A actual, Class<?> selfType) {
            this.actual = actual;
            this.myself = (S) selfType.cast(this);
        }

        protected void isNotNull() {
            if (actual == null) {
                failWithMessage("Expecting actual not to be null");
            }
        }

        protected void failWithMessage(String message, Object... arguments) {
            throw new AssertionError(String.format(message, arguments));
        }
    }

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}