package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    ComboBox_Dinamis CbD;
    String[] items = {
            "Provinsi Sumatera Utara: Memiliki IbuKota: Medan",
            "Provinsi Sumatera Barat: Memiliki IbuKota: Padang",
            "Provinsi Riau: Memiliki IbuKota: Pekanbaru",
            "Provinsi Jawa Barat: Memiliki IbuKota: Bandung",
            "Daerah Khusus Ibukota Jakarta Merupakan Ibukota Republik Indonesia"
    };

    public FormUtama() {
        super("Dinamis ComboBox Items");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        CbD = new ComboBox_Dinamis(items);

        CbD.setPreferredSize(new Dimension(350, 20));
        add(CbD, BorderLayout.NORTH);
        setPreferredSize(new Dimension(350, 150));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
