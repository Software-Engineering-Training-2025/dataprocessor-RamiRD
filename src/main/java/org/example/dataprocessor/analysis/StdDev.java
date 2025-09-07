package org.example.dataprocessor.analysis;

import org.example.dataprocessor.inerfaces.AnalysisTypeService;

import java.util.List;

public class StdDev implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty())
            return Double.NaN;

        double mean =data.stream().mapToDouble(item ->(double) item).average().orElse(Double.NaN);


        double sum=0;
        for (int item : data){
            sum+= (item-mean)*(item-mean);
        }

        return Math.sqrt(sum/data.size());
    }
}
