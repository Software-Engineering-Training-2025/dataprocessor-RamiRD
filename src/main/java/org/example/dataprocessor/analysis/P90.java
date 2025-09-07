package org.example.dataprocessor.analysis;

import org.example.dataprocessor.inerfaces.AnalysisTypeService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P90 implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {
        List<Integer> sorted = new ArrayList<>(data);
        Collections.sort(sorted);
        if (data.isEmpty())
            return Double.NaN;

        int n = data.size();

        double rank = Math.ceil(0.9*n);
        return sorted.get((int) (rank - 1));

    }
}
