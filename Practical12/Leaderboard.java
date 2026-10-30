import java.util.*;

public class Leaderboard {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Rahul", 90);
        scores.put("Amit", 95);
        scores.put("Priya", 95);
        scores.put("Neha", 88);
        scores.put("Yashvi", 90);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(scores.entrySet());
        list.sort((a, b) -> {
            int scoreCompare = Integer.compare(b.getValue(), a.getValue());
            return scoreCompare != 0 ? scoreCompare : a.getKey().compareTo(b.getKey());
        });

        int n = Math.min(3, list.size());
        System.out.println("Leaderboard:");
        for (int i = 0; i < n; i++) {
            Map.Entry<String, Integer> e = list.get(i);
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
