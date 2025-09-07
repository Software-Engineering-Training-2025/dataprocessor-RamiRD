package org.example;

import org.example.dataprocessor.DataProcessorService;
import org.example.dataprocessor.analysis.*;
import org.example.dataprocessor.cleaning.RemoveNegativeService;
import org.example.dataprocessor.cleaning.ReplaceNegativesWithZero;
import org.example.dataprocessor.inerfaces.AnalysisTypeService;
import org.example.dataprocessor.inerfaces.CleanTypeService;
import org.example.dataprocessor.inerfaces.OutputTypeService;
import org.example.dataprocessor.outputs.Console;
import org.example.dataprocessor.outputs.TextFile;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        CleanTypeService cleanTypeService=new RemoveNegativeService();
//        AnalysisTypeService analysisTypeService=new Mean();
//        OutputTypeService outputTypeService=new Console();


        List<Integer> list = List.of(5,-2,7,8) ;

        DataProcessorService dataProcessorService=new DataProcessorService();
        dataProcessorService.process(new RemoveNegativeService(),new Mean(),new Console(),list);
        dataProcessorService.process(new ReplaceNegativesWithZero(),new Median(),new TextFile(),list);


        List<Integer> list2 = List.of(1,3,5,7,9,11,13,15,17,19) ;

        dataProcessorService.process(new RemoveNegativeService(),new P90(),new Console(),list2);

        List<Integer> list3 = List.of(2,4,4,4,5,5,7,9) ;

        dataProcessorService.process(new ReplaceNegativesWithZero(),new StdDev(),new TextFile(),list3);

        List<Integer> list4 = List.of(5,5,5,1,1,2,2,3) ;
        dataProcessorService.process(new RemoveNegativeService(),new Top3FreqElement(),new Console(),list4);



    }
}