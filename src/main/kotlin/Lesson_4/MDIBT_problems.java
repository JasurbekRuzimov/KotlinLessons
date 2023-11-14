package Lesson_4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MDIBT_problems {
    public static List<Integer> findMode(List<Integer> array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        List<Integer> modes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                modes.clear();
                modes.add(entry.getKey());
            } else if (count == maxCount) {
                modes.add(entry.getKey());
            }
        }

        return modes;
    }

    public static List<Integer> sortArray(List<Integer> array) {
        List<Integer> sortedArray = new ArrayList<>(array);
        Collections.sort(sortedArray);
        return sortedArray;
    }

    public static double findMedian(List<Integer> array) {
        List<Integer> sortedArray = new ArrayList<>(array);
        Collections.sort(sortedArray);
        int count = sortedArray.size();

        if (count % 2 == 1) {
            return (double) sortedArray.get(count / 2);
        } else {
            int middle1 = sortedArray.get(count / 2 - 1);
            int middle2 = sortedArray.get(count / 2);
            return (middle1 + middle2) / 2.0;
        }
    }

    public static double findDispersiya(List<Integer> array) {
        int n = array.size();
        double mean = array.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        double sum = 0.0;

        for (int value : array) {
            sum += Math.pow(value - mean, 2);
        }

        return sum / n;
    }

    public static double findOrtacha(List<Integer> array) {
        return array.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static List<Double> findRang(List<Integer> array) {
        List<Integer> sortedArray = new ArrayList<>(array);
        Collections.sort(sortedArray);
        List<Double> rang = new ArrayList<>();

        for (int i = 0; i < sortedArray.size(); ) {
            int j = i;
            while (j < sortedArray.size() && sortedArray.get(i).equals(sortedArray.get(j))) {
                j++;
            }

            double rangValue = (i + j + 1) / 2.0;
            for (int k = i; k < j; k++) {
                rang.add(rangValue);
            }

            i = j;
        }

        return rang;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Collections.addAll(array, 3, 0, 5, 1, 1, 5, 3);
        List<Double> rangValues = findRang(array);
        List<Integer> modes = findMode(array);

        System.out.print("Qator elementlari: ");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Variatsion qator : ");
        List<Integer> sortedArray = sortArray(array);
        for (int item : sortedArray) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Mode: ");
        for (int mode : modes) {
            System.out.print(mode + " ");
        }
        System.out.println();
        System.out.println("Mediana: " + findMedian(array));
        System.out.println("Dispersiya: " + findDispersiya(array));
        System.out.println("Razmax: " + (Collections.max(array) - Collections.min(array)));
        System.out.println("O'rtacha qiymat: " + findOrtacha(array));
        System.out.print("Rang values: ");
        for (double item : rangValues) {
            System.out.print(item + " ");
        }
    }
}

