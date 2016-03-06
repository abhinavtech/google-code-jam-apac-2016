package pl.mszarlinski.googlecodejam.round_e.lazy_spelling_bee;

import java.util.HashSet;
import java.util.Set;

/**
 * @autor mszarlinski
 */
public class LazyBeeSpelling {

    private final Set<Character> chars = new HashSet<>(3);

    public int solution(final String word) {
        if (word.length() <= 1) {
            return 1;
        }

        int counter = 1;
        int len = word.length();

        for (int i = 1; i < len - 1; i++) {
            chars.clear();
            chars.add(word.charAt(i - 1));
            chars.add(word.charAt(i));
            chars.add(word.charAt(i + 1));
            counter *= chars.size();
        }

        // i == 0
        counter *= (word.charAt(0) != word.charAt(1) ? 2 : 1);
        // i == len
        counter *= (word.charAt(len - 1) != word.charAt(len - 2) ? 2 : 1);

        return counter;
    }
}
