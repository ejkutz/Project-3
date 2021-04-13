// --== CS400 File Header Information ==--
// Name: <Eagan
// Email: <EjKutz@gmail.com>
// Team: <Blue>
// Group: <BF>
// TA: <Brianna Cochran>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class Map extends CS400Graph<String>{

  public Map(String filePath) throws FileNotFoundException {
    Scanner input = null;
    try {
      input= new Scanner(new File(filePath));
    } catch (FileNotFoundException e) {
      System.out.print("Bad File");
      throw new FileNotFoundException("Bad file");
    }
    
    input.useDelimiter(",|\\r\\n");
    String vertex=null;
    String destination=null;
    try {
    while (input.hasNext()) {
      vertex=input.next();
      System.out.print(vertex);
      if(!input.hasNext()) {
        throw new IllegalArgumentException();
        
      }
      destination=input.next();
      System.out.print(destination);
      if(!input.hasNext()) {
        throw new IllegalArgumentException();
      }
    
      String weightst=input.next();
      int weight =Integer.parseInt(weightst);
      System.out.print(weight);
      if (!vertices.containsKey(vertex)){
        System.out.print("error1");
        insertVertex(vertex);
      }
      if (!vertices.containsKey(destination)) {
        System.out.print("error2");
          insertVertex(destination);
      }
       insertEdge(vertex, destination, weight );
       insertEdge(destination, vertex, weight );
    }
    }
  catch (IllegalArgumentException e) {
    System.out.print(e);
    return;
  }
    input.close();
}
    }


  
  
  
