/**March 29, 2019
 *
 */
package FileHandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("emp.dat","r");
        RandomAccessFile raf1 = new RandomAccessFile("temp.dat","rw");
        raf.seek(0);
        String s = "";

        while((s = raf.readLine())!=null){
            raf1.seek(raf1.length());
            raf1.writeBytes(s);
            raf1.writeBytes(System.lineSeparator());
        }

    }
}
