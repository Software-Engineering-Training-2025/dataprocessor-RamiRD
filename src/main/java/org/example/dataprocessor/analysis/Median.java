package org.example.dataprocessor.analysis;


import org.example.dataprocessor.inerfaces.AnalysisTypeService;

import java.util.Collections;
import java.util.List;

public class Median implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {

        Collections.sort(data);
        if (data.isEmpty())
            return Double.NaN;

        int n = data.size();
        if (n%2==0){
            return (data.get(n/2) + data.get(n/2-1)) /2.0;
        }else {
            return data.get(n/2);
        }

    }
}
