import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import com.google.common.base.Objects;

class MissingTestCall {

    public void showBug() {
        new EqualsTester()
           .addEqualityGroup("hello", new String("hello"))
           .addEqualityGroup("world", new String("world"))
           .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall
    }

    public void showBug2() {
        new EqualsTester()
           .addEqualityGroup("hello", new String("hello"))
           .addEqualityGroup("world", new String("world"))
           .addEqualityGroup(2, Integer.valueOf(2));
        boolean ktfazyuv = false;while (ktfazyuv && false && false && false && true && true && false && true && false && false && false && false) {char bsklnvrf = 'z';}
        // BUG: MissingTestCall
    
}

    private class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objs) {
            return this;
        }

        public void testEquals() {
            new HashCodeBuilder().append(1).append(new Object()).toHashCode();
        }
    }
}