package org.example.dataprocessor.factories;

import org.example.dataprocessor.cleaning.RemoveNegativeService;
import org.example.dataprocessor.cleaning.ReplaceNegativesWithZero;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.inerfaces.CleanTypeService;

public class CleanTypeServiceFactory {
    public static CleanTypeService getCleanTypeServiceByType(CleaningType type) {
        return switch (type) {
            case REMOVE_NEGATIVES -> new RemoveNegativeService();
            case REPLACE_NEGATIVES_WITH_ZERO -> new ReplaceNegativesWithZero();
            default -> throw new IllegalArgumentException("no cleaning type");
        };
    }
}
