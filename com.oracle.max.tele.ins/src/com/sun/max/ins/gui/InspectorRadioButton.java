/*
 * Copyright (c) 2009, 2012, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.max.ins.gui;

import javax.swing.*;

import com.sun.max.ins.*;

/**
 * A radio button specialized for use in the VM Inspector.
 */
public final class InspectorRadioButton extends JRadioButton {

    /**
     *  Creates a new {@link JRadioButton} specialized for use in the VM Inspector.
     *
     * @param inspection
     * @param text the text to appear in the label
     * @param toolTipText text to display with mouse roll-over
     */
    public InspectorRadioButton(Inspection inspection, String text, String toolTipText) {
        super(text);
        setToolTipText(toolTipText);
        setOpaque(false);
        setFont(inspection.preference().style().textLabelFont());
    }
}
