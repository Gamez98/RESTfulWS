package me.restfulws.utm.service;

import java.nio.file.Path;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	public Path getFile(String fileName);
	public List<Path> walkDir(Path path, List<Path> paths);
	public boolean uploadFile(MultipartFile file, String name, String path);
	public String delete(String path);
}