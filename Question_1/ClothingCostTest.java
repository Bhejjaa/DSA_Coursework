package CourseWork.Question_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClothingCostTest {
    @Test
    public void testMinimumCost() {
        int[][] price = {
                {14, 4, 11},
                {11, 14, 3},
                {14, 2, 10}
        };
        int expectedMinimumCost = 9; 

        int result = ClothingCost.minimumCost(price);
        assertEquals(expectedMinimumCost, result);
    }
}
