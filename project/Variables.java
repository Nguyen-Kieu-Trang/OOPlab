package outputting;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.RDFNode;
import querying.WebData;

import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Variables {
    public String[][] S;
    public Variables(){}
    public void getVariables(String spa){
        WebData w = new WebData(); //Aggregation
        Scanner ip= new Scanner(spa);
        w.sparql="";
        while(ip.hasNext())
        {
            String s=ip.nextLine();
            if(s.equals("end")){break;}
            w.sparql=w.sparql+"\n"+s;
        }

        ResultSet results = w.queryProcessing().execSelect() ;
        List<String> columnNames = results.getResultVars();

        S = new String[100][columnNames.size()];
        S[0][0] = columnNames.get(0);
        S[0][1] = columnNames.get(1);
        S[0][2] = columnNames.get(2);
        int index=1;
        for ( ; results.hasNext() ; )
        {
            QuerySolution soln = results.nextSolution() ;
            //String count = soln.toString();
            //System.out.println(count) ;
            for(int i=0;i<columnNames.size();i++)
            {
                String columnName=columnNames.get(i);
                RDFNode rdfNode=soln.get(columnName);

                S[index][i] = rdfNode.toString();
            }
            index++;
        }

        for(int i=0;i<index;i++)
        {
            for(int j=0;j<columnNames.size();j++)
            {
                System.out.print(S[i][j]+"  ");
            }
            System.out.println("\n\n");
        }




    }
}
