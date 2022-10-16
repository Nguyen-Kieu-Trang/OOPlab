package outputting;

import org.apache.jena.rdf.model.*;
import querying.WebData;
import org.apache.jena.base.Sys;
import java.io.*;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.util.FileManager;

import java.util.Scanner;

public class TurtleFile implements FileOperations{
    public String filename;
    public File file;

    static int index=0;
    public TurtleFile(){};
    public void createFile(String filename) throws IOException{
        this.file = new File(filename);
         //initialize File object and passing path as argument
        boolean result = false;
        try
        {
            result = file.createNewFile();  //creates a new file
            if(result)      // test if successfully created a new file
            {
                this.filename = filename;
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
                System.out.println("\nChoose another name\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();    //prints exception if any
        }
    }
    public void createFile() throws IOException{

        while(1==1){
            index++;
            this.filename="turtle_file" + Integer.toString(index) + ".ttl";
            this.file = new File(filename); //initialize File object and passing path as argument
            boolean result;
            result = file.createNewFile();
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
                break;
            }

        }
    }

    public void writeOut() throws IOException
    {   WebData w = new WebData(); //Aggregation
        Scanner ip= new Scanner(System.in);
        System.out.println("Please input the sparql text( u must type \"end\" in the end of text.): ");
        w.sparql="";
        while(ip.hasNext())
        {
            String s=ip.nextLine();
            if(s.equals("end")){break;}
            w.sparql=w.sparql+"\n"+s;
        }
        //System.out.println(w.sparql);


        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        Model model=w.queryProcessing().execConstruct();
        model.write(outputStream, "TURTLE");//writeIntoFile
        model.write(System.out, "TURTLE"); //writeOutTheDisplay

    }

}

