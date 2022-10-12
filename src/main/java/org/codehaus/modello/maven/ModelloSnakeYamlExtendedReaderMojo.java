package org.codehaus.modello.maven;

/*
 * Copyright (c) 2004-2012, Codehaus.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Creates an Snake Yaml extended reader from the model. An extended reader populates the parsed model with metadata about
 * the line/column from which the data was read if the model supports this.
 *
 * @since 1.8
 * @author <a href="mailto:simonetripodi@apache.org">Simone Tripodi</a>
 */
@Mojo( name = "snakeyaml-extended-reader", defaultPhase = LifecyclePhase.GENERATE_SOURCES, threadSafe = true )
public class ModelloSnakeYamlExtendedReaderMojo
    extends ModelloXpp3ReaderMojo
{

    @Override
    protected String getGeneratorType()
    {
        return "snakeyaml-extended-reader";
    }

}
