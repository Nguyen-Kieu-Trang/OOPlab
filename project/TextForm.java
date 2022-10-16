package outputting;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.RDFNode;
import querying.WebData;
import java.io.FileWriter;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TextForm extends TurtleFile{
    public TextForm(){ }
    public void writeOut() throws IOException
    {
        WebData w = new WebData(); //Aggregation
        Scanner ip= new Scanner(System.in);
        System.out.println("Please input the sparql text( u must type \"end\" in the end of text.): ");
        w.sparql="";
        while(ip.hasNext())
        {
            String s=ip.nextLine();
            if(s.equals("end")){break;}
            w.sparql=w.sparql+"\n"+s;
        }

        ResultSet results = w.queryProcessing().execSelect() ;
        FileWriter fWriter = new FileWriter(filename);
        List<String> columnNames = results.getResultVars();
        //ResultSetFormatter.outputAsCSV(results);
        for ( ; results.hasNext() ; )
        {
            QuerySolution soln = results.nextSolution() ;
            //String count = soln.toString();
            //System.out.println(count) ;
            for(int i=0;i<columnNames.size();i++)
            {
                String columnName=columnNames.get(i);
                RDFNode rdfNode=soln.get(columnName);
                rdfNode.toString();
                fWriter.write(rdfNode+"%-60s%-");
                System.out.println(rdfNode+"  ");
            }
            fWriter.write("\n\n");
            System.out.println("\n");
        }





    }
}
