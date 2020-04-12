import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Words {
    public static void main(String[] args) {
        String[] array = {"ночь", "улица", "фонарь", "аптека", "бессмысленный", "и", "тусклый", "свет", "живи", "еще",
                "хоть", "четверть", "века", "все", "будет", "так", "исхода", "нет", "умрешь", "начнешь", "опять",
                "сначала", "и", "повторится", "все", "как", "встарь", "ночь", "ледяная", "рябь", "канала", "аптека",
                "улица", "фонарь"};

        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < array.length; i++)
            words.add(array[i]);

        System.out.println("Количество уникальных слов: " + words.size());

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String w : words) {
            wordsCount.put(w, 0);
        }

        for (Map.Entry<String, Integer> m : wordsCount.entrySet()) {
            String temp = m.getKey();
            for (int i = 0; i < array.length; i++) {
                if (temp.equals(array[i])) {
                    m.setValue(m.getValue() + 1);
                }
            }
        }
        System.out.println(wordsCount);
    }
}
