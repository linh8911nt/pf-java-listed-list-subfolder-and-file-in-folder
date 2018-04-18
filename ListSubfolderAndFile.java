import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ListSubfolderAndFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Program show directory tree ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the path of directory ");
        String patch = input.nextLine();

        directoryTree(patch);
    }

    public static void directoryTree(String patch) throws IOException {
        File directory = new File(patch);
        if (!directory.exists()){
            System.out.println("Folder " + patch + " are not exist!");
        }
        if (directory.exists()){
            File[] listFile = directory.listFiles();
            if (listFile != null){
                for (File file : listFile) {
                    System.out.println(file.getCanonicalPath());
                    directoryTree(file.getCanonicalPath());
                }
            }
        }
    }
}
