package basics;

import general.AutomatedVars;
import general.Result;
import libraries.FilesHandling;
import libraries.IOHandling;
import libraries.ListsHandling;
import libraries.MathHandling;

import java.util.ArrayList;

public class ProcessHandling
{

    public static void handle(int code, Result result, ArrayList<String> pieces, AutomatedVars automatedVars)
    {
        switch (code)
        {
            case 0: IOHandling.handle(result, pieces); break;
            case 1: ListsHandling.handle(result, pieces); break;
            case 2: MathHandling.handle(result, pieces, automatedVars); break;
            case 3: FilesHandling.handle(result, pieces, automatedVars); break;
        }
    }

}