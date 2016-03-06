package pl.mszarlinski.googlecodejam.round_e.lazy_spelling_bee;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @autor mszarlinski
 */
public class Main {

    private static final LazyBeeSpelling lazyBeeSpelling = new LazyBeeSpelling();

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        int numOfWords = scanner.nextInt();

        IntStream.rangeClosed(1, numOfWords)
            .forEach(i -> {
                final String word = scanner.next();
                final int num = lazyBeeSpelling.solution(word);
                printSolution(i, num);
            });
    }

    private static void printSolution(final int i, final int num) {
        System.out.println("Case #" + i + ": " + num);
    }
}
