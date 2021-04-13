// --== CS400 File Header Information ==--
// Name: <Eagan
// Email: <EjKutz@gmail.com>
// Team: <Blue>
// Group: <BF>
// TA: <Brianna Cochran>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/**
 * Tests the implementation of CS400Graph for the individual component of
 * Project Three: the implementation of Dijsktra's Shortest Path algorithm.
 */
public class GraphTestData {

    private CS400Graph<String> graph;
    
    /**
     * Instantiate graph from last week's shortest path activity.
     */
    @BeforeEach
    public void createGraph() {
        try {
          graph = new Map("C:\\Users\\Eagan\\MapData.csv");
        } catch (FileNotFoundException e) {
        }
      
    }

    /**
     * Checks the distance/total weight cost from the vertex should be equal to
     * Bascom Hall
     */
    @Test
    public void providedTestToCheckPathCosts() {
        assertTrue(graph.getPathCost("Bascom Hall", "College Library") == 20);    
    }

    /**
     * Checks the ordered sequence of data within vertices from the vertex 
     * labelled C to E, and from the vertex labelled A to C.
     */
 
    @Test
    public void TestBadFile() {
      assertThrows(FileNotFoundException.class, () -> { 
        graph = new Map("");
      });
    }/**
     * Checks if input is ok even using two sam vertexes.
     */
    @Test
    public void Diffdirection() {
      assertTrue(graph.getPathCost("College Library", "Bascom Hall" ) == 20);
        }
      
    }
