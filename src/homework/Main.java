package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        /*1. Переписать первую задачу из вчерашнего задания с использованием StringBuilder:
         Есть текстовый файл. Написать метод, читающий файл и возвращающий строку, состоящую из
         строчек этого файла.
         Write a method to read a text file into a String using StringBuilder class*/
        File file=new File("input.txt");
        System.out.println(readIntoString(file));

        /*2.Написать метод, возвращающий слова в строке в обратном порядке. Использовать
        StringBuilder. Слова разделяются пробелом.
        Пример: "The weather today is great" -> "great is today weather The "
        Write a method to reverse words in a String. Use StringBuilder*/
        String str="The weather today is great";
        System.out.println(reverseStringByWords(str));
        //great is today weather The

    }
    public static StringBuilder readIntoString(File filename) throws IOException {
        StringBuilder str = new StringBuilder("");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                str = new StringBuilder(str + " " + line);

            }
        }
        return str;
    }
    public static StringBuilder reverseStringByWords(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split(" ");

        for (int i = words.length-1; i >= 0; i--) {
           stringBuilder.append(words[i]).append(' ');
        }return stringBuilder;

    }
}
