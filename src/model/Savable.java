package model;

public interface Savable {
    void save(String path, String data);
    String upload(String path);
}
