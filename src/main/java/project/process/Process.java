package project.process;

import java.util.HashMap;
import java.util.Map;

public class Process {
    public <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> counts = new HashMap<>();
        for (T t : array) {
            if (t == null) {
                continue;
            }
            counts.put(t, counts.getOrDefault(t, 0) + 1);
        }
        return counts;
    }
}