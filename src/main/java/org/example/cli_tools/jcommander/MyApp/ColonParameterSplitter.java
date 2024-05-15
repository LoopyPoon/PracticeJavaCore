package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.converters.IParameterSplitter;

import java.util.List;

public class ColonParameterSplitter implements IParameterSplitter {
    @Override
    public List<String> split(String value) {
        return List.of(value.split(":"));
    }
}
