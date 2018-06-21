package file;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class List_file {
	  public static void main(String[] args) throws IOException {
		List_file If=new List_file();
		If.list();
	}
	public void list() throws IOException {
		try {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the path )");
	        String path1 = sc.nextLine();
	        System.out.println("Enter the path of output file(.csv): ");
	        String path2 = sc.nextLine();
	        File f2 = new File(path2);
            f2.createNewFile();
	        sc.close();
		File file=new File(path1);
		System.out.println("Folder name--> "+file.getName()+" at path "+file.getPath());
		for (Object object : file.listFiles()) {
			System.out.println(object);
		}
	}
		catch(Exception e) {
			System.out.println("Incorrect");
		}
	}
}

