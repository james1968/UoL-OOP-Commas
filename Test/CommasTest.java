import org.junit.Test;
import static org.junit.Assert.*;

public class CommasTest {
    @Test

    public void separate() throws Exception {
            assertEquals("h,e,l,l,o", Commas.separate("hello"));
        assertEquals("h,e,l,l,o,,,,w,o,r,l,d", Commas.separate("hello, world"));
        }


    }
