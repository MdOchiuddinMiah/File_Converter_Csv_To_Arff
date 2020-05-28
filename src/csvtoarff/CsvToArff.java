/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvtoarff;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import java.io.File;

public class CsvToArff {

  public static void main(String[] args) throws Exception {
    
    // load CSV
    CSVLoader loader = new CSVLoader();
    loader.setSource(new File("C:\\Users\\omi\\Desktop\\omi.csv"));
    Instances data = loader.getDataSet();//get instances object

    // save ARFF
    ArffSaver saver = new ArffSaver();
    saver.setInstances(data);//set the dataset we want to convert
    //and save as ARFF
    saver.setFile(new File("C:\\Users\\omi\\Desktop\\omi.arff"));
    saver.writeBatch();
  }
}
