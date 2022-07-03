import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void lengthOfLISExample1() {
    assertEquals(4, sol.lengthOfLIS(new int[]{
        10,9,2,5,3,7,101,18
    }));
  }
  @Test
  void lengthOfLISExample2() {
    assertEquals(4, sol.lengthOfLIS(new int[]{
        0,1,0,3,2,3
    }));
  }
  @Test
  void lengthOfLISExample3() {
    assertEquals(1, sol.lengthOfLIS(new int[]{
        7,7,7,7,7,7,7
    }));
  }

  @Test
  void lengthOfLISBinarySearchExample1() {
    assertEquals(4, sol.lengthOfLISBinarySearch(new int[]{
        10,9,2,5,3,7,101,18
    }));
  }
  @Test
  void lengthOfLISBinarySearchExample2() {
    assertEquals(4, sol.lengthOfLISBinarySearch(new int[]{
        0,1,0,3,2,3
    }));
  }
  @Test
  void lengthOfLISBinarySearchExample3() {
    assertEquals(1, sol.lengthOfLISBinarySearch(new int[]{
        7,7,7,7,7,7,7
    }));
  }
}