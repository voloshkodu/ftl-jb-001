package com.company.L026;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class FileExample {

    public static String readUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        StringBuilder stringBuilder = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
        }

        in.close();
        return stringBuilder.toString();
    }

    public static void writeFile (String path, String content) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.close();

        System.out.println(file.getAbsolutePath());

    }

    public static String readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        String response = "";

        while (scanner.hasNextLine()) {
            response += scanner.nextLine();
        }

        fileReader.close();
        return response;
    }

    public static void run() throws IOException {
        String url = "https://ya.ru";
        String content = readUrl(url);
        System.out.println(content);

        writeFile("ya.txt", content);
        System.out.println(readFile("ya.txt"));
    }
}
