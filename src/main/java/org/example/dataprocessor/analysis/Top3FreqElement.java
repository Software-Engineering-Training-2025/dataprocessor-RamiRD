package org.example.dataprocessor.analysis;

import org.example.dataprocessor.inerfaces.AnalysisTypeService;

import java.util.*;

public class Top3FreqElement implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {
        Map<Integer, Integer> frequencyMap=new HashMap<>();
        for (int item:data){
            int count =frequencyMap.getOrDefault(item,0)+1;
            frequencyMap.put(item,count);
        }

        double sum=0;
        List<Integer>values=new ArrayList<>();
        for (int key: frequencyMap.keySet()){
            values.add(frequencyMap.get(key));
        }
        Collections.sort(values);
        Collections.reverse(values);
        for (int i =0;i<Math.min(values.size(),3);i++){
            sum+=values.get(i);
        }
        return sum;
    }
}
