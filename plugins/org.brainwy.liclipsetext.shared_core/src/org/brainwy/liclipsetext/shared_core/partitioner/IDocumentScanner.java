/**
 * Copyright: Fabio Zadrozny
 * License: EPL
 */
package org.brainwy.liclipsetext.shared_core.partitioner;

import org.eclipse.jface.text.IDocument;

public interface IDocumentScanner {

    /**
     * Provides a way to get the underlying document of the scanner.
     */
    IDocument getDocument();

}
