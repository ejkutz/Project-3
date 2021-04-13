import java.io.File;
import java.io.FileNotFoundException;
import java.util.IllegalFormatException;
import java.util.Scanner;




public class Map extends CS400Graph<String>{

  public Map(String filePath) {
    File fileP= new File(filePath);
    Scanner input;
    try {
      input= new Scanner(fileP);
    } catch (FileNotFoundException e) {
      System.out.print("Bad File");
      return;
    }
    
    input.useDelimiter(",");
    String vertex=null;
    String destination=null;
    try {
    while (input.hasNext()) {
      vertex=input.next();
      if(!input.hasNext()) {
        throw new IllegalArgumentException();
      }
      destination=input.next();
      if(!input.hasNext()) {
        throw new IllegalArgumentException();
      }
    }
      int weight=input.nextInt();
      if (!vertices.containsKey(vertex)){
        insertVertex(vertex);
      }
      if (!vertices.containsKey(destination)) {
          insertVertex(destination);
      }
        insertEdge(vertex, destination, weight );
        insertEdge(destination, vertex, weight );
    }
  catch (IllegalArgumentException e) {
    System.out.print(e);
    return;
  }
    input.close();
}
    }


  
  
  
