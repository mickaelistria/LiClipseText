/**
 * Copyright (c) 20015 by Brainwy Software Ltda. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package org.brainwy.liclipsetext.shared_core.partitioner;

import org.brainwy.liclipsetext.shared_core.string.FastStringBuffer;

public interface IContentsScanner {

    void getContents(int offset, int length, FastStringBuffer buffer);

}
