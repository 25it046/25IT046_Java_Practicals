import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FolderTreeReport {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("file-folder");
        Path report = root.resolve("file-report.txt");
        Files.createDirectories(root.resolve("documents"));
        Files.createDirectories(root.resolve("images"));
        Files.writeString(root.resolve("documents/notes.txt"), "Java OOP practical");
        Files.writeString(root.resolve("images/photo.txt"), "Sample image description");

        StringBuilder result = new StringBuilder();
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                result.append("Name: ").append(file.getFileName()).append("\n")
                      .append("Size: ").append(attrs.size()).append(" bytes\n")
                      .append("Modified: ").append(attrs.lastModifiedTime()).append("\n")
                      .append("----------------\n");
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) {
                result.append("Cannot access: ").append(file).append(" - ").append(exc.getMessage()).append("\n");
                return FileVisitResult.CONTINUE;
            }
        });

        Files.writeString(report, result.toString());
        System.out.println("Folder scan completed.");
        System.out.println("Report saved to: " + report.toAbsolutePath());
        System.out.println("Report contents:");
        System.out.println(result);
    }
}
