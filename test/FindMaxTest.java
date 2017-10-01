import org.junit.Test;
import static org.junit.Assert.*;
public class FindMaxTest {
    @Test
    public void test1() {
        FindMax arr = new FindMax(new int[] {5, 0, 27, -156, -1, 169});
        assertEquals(arr.findMax(), 169);
        arr.price = new int[] {21, 0, -65, -47, 121, 3, -2, 0, -69, 33};
        assertEquals(arr.findMax(), 124);
        arr.price = new int[] {167, -167, 33, -99, 364, 2, -10, -11, 4, 36, 10, 0, -99};
        assertEquals(arr.findMax(), 395);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void test2() {
        FindMax arr = new FindMax(new int[0]);
        assertEquals(arr.findMax(), 69);
     }
}
