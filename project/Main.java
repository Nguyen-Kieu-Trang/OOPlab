package testing;

import outputting.TextForm;
import outputting.TurtleFile;
import outputting.Variables;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        TurtleFile t1 = new TurtleFile();
        TurtleFile t2 = new TextForm();
        String name;
        int num;
        /*String str="select distinct ?p ?abstract ?thumb\n" +
                "where {\n" +
                "       {{?p rdf:type dbo:Cave.} UNION {?p rdf:type dbo:NaturalPlace.}}\n" +
                "       {{?p dbo:location dbr:Vietnam.} UNION {?p dbo:country dbr:Vietnam.}}\n" +
                "       ?p rdfs:comment ?abstract.\n" +
                "       ?p dbo:thumbnail ?thumb\n" +
                "       FILTER ( LANG ( ?abstract ) = 'en' )\n" +
                "}\n" +
                "LIMIT 100";
        Variables v = new Variables();
        v.getVariables(str); */

        Scanner ip1 = new Scanner(System.in);
        System.out.println("Input the file name: ");
        name = ip1.nextLine();
        if(name.equals(""))
        {   Scanner ip2 = new Scanner(System.in);
            System.out.println("Do u want to print into Turtle format(press 1) or Text format(press 2):");
            num = ip2.nextInt();
            if(num==1) {
                t1.createFile();
                t1.writeOut();
            } else if (num==2) {
                t2.createFile();
                t2.writeOut();
            }
        }
        else
        {
            Scanner ip3 = new Scanner(System.in);
            System.out.println("Do u want to print into Turtle format(press 1) or Text format(press 2):");
            num = ip3.nextInt();
            if(num==1) {
                t1.createFile(name);
                t1.writeOut();
            } else if (num==2) {
                t2.createFile(name);
                t2.writeOut();
            }
        }





    }
}
