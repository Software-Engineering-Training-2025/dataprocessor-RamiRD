package org.example.dataprocessor.factories;

import org.example.dataprocessor.analysis.*;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.inerfaces.AnalysisTypeService;

public class AnalysisTypeServiceFactory {

    public static AnalysisTypeService getAnalysisTypeServiceByType(AnalysisType type) {
        return switch (type) {
            case MEAN -> new Mean();
            case MEDIAN -> new Median();
            case STD_DEV -> new StdDev();
            case P90_NEAREST_RANK -> new P90();
            case TOP3_FREQUENT_COUNT_SUM -> new Top3FreqElement();
            default -> throw new IllegalArgumentException("Unknown analysis type: " );
        };
    }
}
