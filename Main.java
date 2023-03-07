import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);

  Scanner sc = new Scanner(System.in); 
  Scanner question = new Scanner(System.in); 

    while (true) {
      
    System.out.println("Press 1 to learn about the salary");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about the demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");

       String input = sc.nextLine(); 
    
        if (input.equals("1")) {
      System.out.println("$98,345 is the average salary in South Florida");
      
      } else if (input.equals("2")) {
      System.out.println("US News - 100 Best Jobs!");
      
      } else if (input.equals("3")) {
      System.out.println("Top 10 Forbes In-demand Jobs!");
      
      } else if (input.equals("4")) {
      while (fileScanner.hasNextLine()) {
        String data = fileScanner.nextLine();
        System.out.println(data);
      }
    } else if (input.equals("5")) {
      System.out.println("exiting...");
      return;
    }
    }
    
  

    
    

  
  
  
  }
}