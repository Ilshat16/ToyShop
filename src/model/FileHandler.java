package model;

import java.io.*;

public class FileHandler implements Savable{
    @Override
    public void save(String path, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Запись в файл успешно выполнена.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    @Override
    public String upload(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            System.out.println("Чтение из файла успешно выполнено.");
            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
        return null;
    }
}
