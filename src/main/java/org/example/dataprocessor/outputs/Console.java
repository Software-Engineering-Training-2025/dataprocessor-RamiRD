package org.example.dataprocessor.outputs;

import org.example.dataprocessor.inerfaces.OutputTypeService;

public class Console implements OutputTypeService {
    @Override
    public void output(Double result) {
        System.out.println("Result = " + result);
    }
}
