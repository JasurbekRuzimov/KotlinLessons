package Lesson_4;

import java.util.ArrayList;

public class Combiatoric {
    public static void main(String[] args) {
        int n = 20; // o'yinlar soni
        int totalCombinations = (int) Math.pow(2, n); // umumiy kombinatsiyalar soni

        System.out.println("Umumiy kombinatsiyalar soni: " + totalCombinations);

        // 20 tadan guruhlab chiqish
        int groupSize = 20;
        int groups = totalCombinations / groupSize;
        System.out.println("Guruhlar soni: " + groups);

        // Guruhlar ro'yxati
        ArrayList<ArrayList<String>> groupsList = new ArrayList<>();

        for (int i = 0; i < groups; i++) {
            ArrayList<String> group = new ArrayList<>();
            for (int j = 0; j < groupSize; j++) {
                // O'yinlar kombinatsiyalari
                group.add("O'yin " + (i * groupSize + j + 1));
            }
            groupsList.add(group);
        }

        // Guruhlar ro'yxatini chiqarish
        for (int i = 0; i < groupsList.size(); i++) {
            System.out.println((i + 1) + "-guruh: " + groupsList.get(i));
        }
    }
}
