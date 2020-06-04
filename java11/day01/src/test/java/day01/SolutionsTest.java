package day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionsTest {

  @Test
  public void testSolution1_1() {
    assertEquals(0, Solutions.solution1("(())"));
    assertEquals(0, Solutions.solution1("()()"));
  }

  @Test
  public void testSolution1_2() {
    assertEquals(3, Solutions.solution1("((("));
    assertEquals(3, Solutions.solution1("(()(()("));
    assertEquals(3, Solutions.solution1("))((((("));
  }

  @Test
  public void testSolution1_3() {
    assertEquals(-1, Solutions.solution1("())"));
    assertEquals(-1, Solutions.solution1("))("));
  }

  @Test
  public void testSolution1_4() {
    assertEquals(-3, Solutions.solution1(")))"));
    assertEquals(-3, Solutions.solution1(")())())"));
  }

  @Test
  public void testSolution2_1() {
    assertEquals(1, Solutions.solution2(")"));
  }

  @Test
  public void testSolution2_2() {
    assertEquals(5, Solutions.solution2("()())"));
  }

  @Test
  public void testSolution2_3() {
    assertEquals(9, Solutions.solution2("(((())))))"));
  }

  @Test
  public void testSolution2_4() {
    assertEquals(7, Solutions.solution2("(())()))))"));
  }

  @Test
  public void testSolution2_5() {
    assertEquals(13, Solutions.solution2("(())(())(()))((("));
  }
}
