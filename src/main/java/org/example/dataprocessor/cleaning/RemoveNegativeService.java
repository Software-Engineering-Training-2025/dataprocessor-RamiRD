package org.example.dataprocessor.cleaning;

import org.example.dataprocessor.inerfaces.CleanTypeService;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegativeService implements CleanTypeService {
    @Override
    public List<Integer> clean(List<Integer> data) {
        List<Integer>cleaned = new ArrayList<>();
        for (int item : data){
            if(item >=0){
                cleaned.add(item);
            }


        }
        return cleaned;
    }
}
