package org.openapitools.codegen.cpp.oatpp;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.CppOatppServerCodegen;
import org.openapitools.codegen.options.CppOatppServerCodegenOptionsProvider;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CppOatppServerCodegenOptionsTest extends AbstractOptionsTest {
    private CppOatppServerCodegen codegen = mock(CppOatppServerCodegen.class, mockSettings);

    public CppOatppServerCodegenOptionsTest() {
        super(new CppOatppServerCodegenOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return codegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void verifyOptions() {
        // TODO: Complete options using Mockito
        // verify(codegen).someMethod(arguments)
    }
}

