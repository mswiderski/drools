package org.drools.core.common;

import java.io.IOException;
import java.io.InputStream;

public interface ResourceDelegate {

    InputStream getResourceAsStream(String resource) throws IOException;
}
