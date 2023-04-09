package com.hillel.reziapov.homeworks.homework8;

import java.util.*;

public class FileNavigator {

    private Map<String, List<FileData>> filesByPath;

    public FileNavigator() {
        filesByPath = new HashMap<>();
    }

    public void add(FileData fileData) {
        String path = fileData.getPath();
        if (!path.equals(getKeyForPath(path))) {
            System.out.println("Cannot add file data with inconsistent path.");
            return;
        }
        List<FileData> files = filesByPath.getOrDefault(path, new ArrayList<>());
        files.add(fileData);
        filesByPath.put(path, files);
    }

    public List<FileData> find(String path) {
        return filesByPath.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (List<FileData> files : filesByPath.values()) {
            for (FileData file : files) {
                if (file.getSize() <= maxSize) {
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        filesByPath.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> files : filesByPath.values()) {
            allFiles.addAll(files);
        }
        allFiles.sort((file1, file2) -> Long.compare(file1.getSize(), file2.getSize()));
        return allFiles;
    }

    private String getKeyForPath(String path) {
        for (String key : filesByPath.keySet()) {
            if (path.startsWith(key)) {
                return key;
            }
        }
        return path;
    }

}
