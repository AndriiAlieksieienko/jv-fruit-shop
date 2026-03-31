package core.basesyntax.filemanager;

import java.util.List;

public interface FileManager {
    List<String[]> read(String inputFile);

    void write(List<String[]> report, String outputFile);
}
