package org.example.dataprocessor;

import org.example.dataprocessor.analysis.Mean;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.inerfaces.AnalysisTypeService;
import org.example.dataprocessor.inerfaces.CleanTypeService;
import org.example.dataprocessor.inerfaces.OutputTypeService;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * Students ONLY implement the process(...) method below.
 * <p>
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
public class DataProcessorService {

    /**
     * Implement this method.
     */
    public double process(CleanTypeService cleaningType, AnalysisTypeService analysisType, OutputTypeService outputType, List<Integer> data)  {


        List<Integer> list = new ArrayList<>();

        list = cleaningType.clean(data);
        double value = analysisType.analyze(list);
        outputType.output(value);


        // TODO: implement using the enums only (no long if/else ladders required,
        // but minimal branching to select behavior by enum is acceptable in this task).
        // Steps:
        // 1) Copy & clean data according to cleaningType.
        // 2) Analyze cleaned array according to analysisType.
        // 3) Output according to outputType (console or target/result.txt).
        // 4) Return the numeric result.

return value;
    }
}

