package org.example.dataprocessor.factories;

import org.example.dataprocessor.outputs.Console;
import org.example.dataprocessor.outputs.TextFile;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.inerfaces.OutputTypeService;

public class OutputTypeServiceFactory {
    public static OutputTypeService getOutputTypeServiceByType(OutputType type) {
        return switch (type) {
            case CONSOLE -> new Console();
            case TEXT_FILE -> new TextFile();
            default -> throw new IllegalArgumentException("Unknown output type: ");
        };
    }
}
