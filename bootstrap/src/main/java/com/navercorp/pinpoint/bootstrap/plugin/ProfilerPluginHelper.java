package com.nhn.pinpoint.bootstrap.plugin;

import com.nhn.pinpoint.bootstrap.context.TraceContext;
import com.nhn.pinpoint.bootstrap.instrument.ByteCodeInstrumentor;

public class ProfilerPluginHelper {
    private final ByteCodeInstrumentor instrumentor;
    private final TraceContext traceContext;
    
    public ProfilerPluginHelper(ByteCodeInstrumentor instrumentor, TraceContext traceContext) {
        this.instrumentor = instrumentor;
        this.traceContext = traceContext;
    }

    public ClassEditorBuilder getClassEditorBuilderFor(String targetClassName) {
        return new ClassEditorBuilder(instrumentor, traceContext, targetClassName); 
    }
    
}