package other.mmm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Competence {
    static Scanner sc = new Scanner(System.in);
    static Scanner scS = new Scanner(System.in);

    public static void main(String[] args) {
        int numTitles = sc.nextInt();

        List<String> titles = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < numTitles; i++) {
            titles.add(scS.nextLine());
        }

        int sequence;

        final long startTime = System.nanoTime();

        for (int index = 0; index < titles.size() - 1; index ++) {
            if (titles.get(index).toLowerCase().startsWith("a") && index != titles.size()-1) {
                count.clear();
                sequence = 0;
                sequence += 1;

                for (int indexB = index; indexB < titles.size() - 1; indexB ++){
                    int countMethod = compareAlphabetically(titles.get(indexB), titles.get(indexB + 1));
                    sequence += countMethod;
                    if (countMethod == 0) break;
                }

            } else sequence = 0;

            count.add(sequence);
        }

        final long endTime = System.nanoTime();
        System.out.println("Total execution time: " + (endTime - startTime));
        System.out.println(Collections.max(count));
    }
    private static int compareAlphabetically(String str1, String str2) {
        int n;
        char letter1 = str1.charAt(0);
        char letter2 = str2.charAt(0);
        if(letter1 < letter2) n = 1; else n = 0;
        return n;
    }
}
