package org.example.dataprocessor.analysis;

import org.example.dataprocessor.inerfaces.AnalysisTypeService;

import java.util.List;

public class Mean implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum /data.size();
    }
}
