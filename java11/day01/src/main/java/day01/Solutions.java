package day01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solutions {
  private static int char_to_int(char c) {
    if (c == '(') {
      return 1;
    }
    return -1;
  }

  private static IntStream string_to_intstream(String s) {
    return s.chars().map(c -> char_to_int((char) c));
  }

  public static int solution1(String input) {
    return string_to_intstream(input).sum();
  }

  private static void update_position_in_state(Map<String, Integer> state, Integer n) {
    Integer position = state.get("position");
    if (position == -1) {
      Integer i = state.get("i") + 1;
      Integer floor = state.get("floor") + n;
      state.replace("i", i);
      state.replace("floor", floor);
      if (floor == -1) {
        state.replace("position", i);
      }
    }
  }

  public static int solution2(String input) {
    Map state = new HashMap<String, Integer>();
    state.put("i", 0);
    state.put("floor", 0);
    state.put("position", -1);
    string_to_intstream(input).forEach(n -> update_position_in_state(state, n));
    return (int) state.get("position");
  }
}
