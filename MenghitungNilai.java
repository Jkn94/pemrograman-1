import javax.swing.*;
import java.awt.event.*;

public class MenghitungNilai extends JFrame {
    public MenghitungNilai()
    {
        initial_component();
    }

    private void initial_component()
    {
        setTitle("Nilai Mahasiswa");
        setSize(650, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        // label => start
        JLabel namaLabel = new JLabel("NAMA");
        JLabel nimLabel = new JLabel("NIM");
        JLabel jkLabel = new JLabel("KELAMIN");
        JLabel fakLabel = new JLabel("FAKULTAS");
        JLabel absenLabel = new JLabel("ABSEN");
        JLabel tugasLabel = new JLabel("TUGAS");
        JLabel utsLabel = new JLabel("UTS");
        JLabel uasLabel = new JLabel("UAS");

        panel.add(namaLabel);
        panel.add(nimLabel);
        panel.add(jkLabel);
        panel.add(fakLabel);
        panel.add(absenLabel);
        panel.add(tugasLabel);
        panel.add(utsLabel);
        panel.add(uasLabel);

        namaLabel.setBounds(30, 30, 90, 25);
        nimLabel.setBounds(30, 60, 90, 25);
        jkLabel.setBounds(30, 90, 90, 25);
        fakLabel.setBounds(30, 150, 90, 25);
        absenLabel.setBounds(30, 180, 90, 25);
        tugasLabel.setBounds(30, 210, 90, 25);
        utsLabel.setBounds(30, 240, 90, 25);
        uasLabel.setBounds(30, 270, 90, 25);
        // label => end

        // text field => start
        JTextField namaField = new JTextField();
        JTextField nimField = new JTextField();
        JRadioButton lakiButt = new JRadioButton("WADON");
        JRadioButton ceweButt = new JRadioButton("LANANG");

        // # init componen combobox
        String[] fakultas = new String[] {"FAKULTAS", "T.INFORMATIKA", "T.MESIN", "T.INDUSTRI", "T.KIMIA"};
        JComboBox<String> fakCombo = new JComboBox<>(fakultas);
        JTextField absenField = new JTextField();
        JTextField tugasField = new JTextField();
        JTextField utsField = new JTextField();
        JTextField uasField = new JTextField();

        panel.add(namaField);
        panel.add(nimField);
        panel.add(lakiButt);
        panel.add(ceweButt);
        panel.add(fakCombo);
        panel.add(absenField);
        panel.add(tugasField);
        panel.add(utsField);
        panel.add(uasField);

        namaField.setBounds(150, 30, 150, 20);
        nimField.setBounds(150, 60, 150, 20);
        lakiButt.setBounds(150, 90, 100, 20);
        ceweButt.setBounds(150, 120, 100, 20);
        fakCombo.setBounds(150, 150, 150, 20); 
        absenField.setBounds(150, 180, 150, 20);
        tugasField.setBounds(150, 210, 150, 20);
        utsField.setBounds(150, 240, 150, 20);
        uasField.setBounds(150, 270, 150, 20);

        JButton showButt = new JButton("TAMPIL");
        JButton closeButt = new JButton("KELUAR");

        panel.add(showButt);
        panel.add(closeButt);
        showButt.setBounds(30, 320, 100, 25);
        closeButt.setBounds(140, 320, 100, 25);

        JLabel nama_label = new JLabel("NAMA LENGKAP : ");
        JLabel nim_label = new JLabel("NIM : ");
        JLabel kelamin_label = new JLabel("J.KELAMIN : ");
        JLabel fak_label = new JLabel("FAKULTAS  : ");
        JLabel nilai_label = new JLabel("NILAI : ");

        panel.add(nama_label);
        panel.add(nim_label);
        panel.add(kelamin_label);
        panel.add(fak_label);
        panel.add(nilai_label);

        nama_label.setBounds(350, 30, 100, 25);
        nim_label.setBounds(350, 70, 100, 25);
        kelamin_label.setBounds(350, 110, 100, 25);
        fak_label.setBounds(350, 150, 100, 25);
        nilai_label.setBounds(350, 190, 100, 25);

        JLabel nama_hasil = new JLabel("");
        JLabel nim_hasil = new JLabel("");
        JLabel kelamin_hasil = new JLabel("");
        JLabel fak_hasil = new JLabel("");
        JLabel nilai_hasil = new JLabel("");

        panel.add(nama_hasil);
        panel.add(nim_hasil);
        panel.add(kelamin_hasil);
        panel.add(fak_hasil);
        panel.add(nilai_hasil);

        nama_hasil.setBounds(480, 30, 90, 25);
        nim_hasil.setBounds(480, 70, 90, 25);
        kelamin_hasil.setBounds(480, 110, 90, 25);
        fak_hasil.setBounds(480, 150, 90, 25);
        nilai_hasil.setBounds(480, 190, 90, 25);

        showButt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt)
            {
                double absen = 0, tugas = 0, uts = 0, uas = 0, nilai = 0;
                String nama_tamp, nim_tamp, kelamin_tamp, fak_tamp, nilai_tamp;

                nama_tamp = namaField.getText();
                nim_tamp = nimField.getText();
                if( lakiButt.isSelected() ) {
                    kelamin_tamp = lakiButt.getText();
                } else {
                    kelamin_tamp = ceweButt.getText();
                }
                fak_tamp = (String)fakCombo.getSelectedItem();
                absen = Double.parseDouble(absenField.getText());
                tugas = Double.parseDouble(tugasField.getText());
                uts = Double.parseDouble(utsField.getText());
                uas = Double.parseDouble(uasField.getText());

                nilai = (absen * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);
                
                nama_hasil.setText(nama_tamp);
                nim_hasil.setText(nim_tamp);
                kelamin_hasil.setText(kelamin_tamp);
                fak_hasil.setText(fak_tamp);
                nilai_hasil.setText(Double.toString(nilai));
            }
        });

        closeButt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt)
            {
                close_windows(evt);
            }
        });
    }

   

    private void close_windows(ActionEvent evt)
    {
        JOptionPane.showMessageDialog(this, "SONO LU. NGERIBETIN AJA !!");
        System.exit(0);
    }


    public static void main(String[] args)
    {
        new MenghitungNilai().setVisible(true);
    }
}