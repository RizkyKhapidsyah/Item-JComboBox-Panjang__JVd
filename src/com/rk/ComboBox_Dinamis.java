package com.rk;

import javax.swing.*;
import java.awt.*;

public class ComboBox_Dinamis extends JComboBox {

    public ComboBox_Dinamis(String[] items) {
        super(items);
    }

    @Override
    public Dimension getSize() {
        Dimension dimen = super.getSize();
        int widestIdemWidth = getWidesItemWidth();

        dimen.width = Math.max(widestIdemWidth, dimen.width);
        return dimen;
    }

    private int getWidesItemWidth() {
        int itemWidth = 0;

        for (int i = 0; i < this.getItemCount(); i++) {
            Component comp = this.getRenderer().getListCellRendererComponent(new JList(this.getModel()), this.getItemAt(i), i, false, false);
            itemWidth = Math.max(itemWidth, comp.getPreferredSize().width);
        }

        return itemWidth + 20;
    }
}
