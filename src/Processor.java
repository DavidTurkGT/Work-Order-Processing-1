import java.io.*;
import java.util.*;

/**
 * Created by David Turk on 7/28/17.
 */
public class Processor {
    Map<Status,List> workOrders = new HashMap<>();

    public void processWorkOrders() {
        moveIt();
        readIt();
    }

    private void moveIt() {
        

    }

    private void readIt() {
        // read the json files into WorkOrders and put in map
        File currentDirectory = new File(".");
        File files[] = currentDirectory.listFiles();
        for (File f : files) {
            if (f.getName().endsWith(".json")) {
                // f is a reference to a json file

                // f.delete(); will delete the file
            }
        }
    }

    public static void main(String args[]) {
        Processor processor = new Processor();
        while (true) {
            processor.processWorkOrders();
            try {
                Thread.sleep(5000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
