// --== CS400 File Header Information ==--
// Name: Carter Lindstrom
// Email: cjlindstrom@wisc.edu
// Team: BF
// TA: Brianna Cochran
// Lecturer: Gary Dahl
// Notes to Grader: N/A

public class TestBackend {

  public static void main(String[] args) {
    testGetBuildings();
    System.out.println(testShortestDistance());
    testShortestPath();

  }
  
  public static void testGetBuildings() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    testBE.printBuildings();
  }
  
  public static boolean testShortestDistance() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    int actual = 9;
    if(testBE.getShortestDistance("8", "3") != actual) {
      return false;
    }
    actual = 11;
    if(testBE.getShortestDistance("0", "5") != actual) {
      return false;
    }
    actual = 12;
    if(testBE.getShortestDistance("5", "1") != actual) {
      return false;
    }
    return true;
    
  }
  
  public static void testShortestPath() {
    Map testMap = new Map("MapData.csv");
    Backend testBE = new Backend(testMap);
    System.out.println(testBE.getShortestPath("6", "3"));
  }
  
  

}
