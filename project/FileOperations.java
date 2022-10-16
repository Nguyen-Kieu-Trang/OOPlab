package outputting;

import java.io.IOException;

public interface FileOperations {
    public void createFile() throws IOException;
 

    
    public void createFile(String filename)throws IOException;
    public void writeOut() throws IOException;
}
