package br.com.leitorTimeFifa.modelo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import br.com.leitorTimeFifa.util.Leitor;

public class MainWindow {
    private JFrame frame;
    private JComboBox<Integer> comboBox;
    private JList<String> list;

    public MainWindow() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 679, 406);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        JDesktopPane desktopPane = new JDesktopPane();
        frame.getContentPane().add(desktopPane);

        Integer[] ratings = new Integer[13];
        int rate = 78;
        for (int i = 0; i < 13; i++) {
            ratings[i] = rate;
            rate++;
        }

        DefaultComboBoxModel<Integer> comboBoxModel = new DefaultComboBoxModel<>(ratings);
        comboBox = new JComboBox<>(comboBoxModel);
        comboBox.setSelectedIndex(5);
        comboBox.setBounds(10, 27, 89, 29);
        desktopPane.add(comboBox);

        JButton btnNewButton = new JButton("Solve");
        btnNewButton.addActionListener(new ActionListener() {
            List<Jogador> jogadorList = new ArrayList<>(); // Variável para armazenar a lista de jogadores

            public void actionPerformed(ActionEvent e) {
                try {

                    Leitor le = new Leitor((int) comboBox.getSelectedItem());
                    List<SBC> sbcList = new ArrayList<SBC>();
                    sbcList = le.Constroi();
                    final List<SBC> finalSbcList = sbcList; // Variável final para armazenar a referência da lista
                    DefaultListModel<String> listModel = new DefaultListModel<>();

                    for (SBC sbc : sbcList) {
                        if (sbc != null) {
                            listModel.addElement(sbc.toString());
                        }
                    }
                    list.setModel(listModel);

                    // Atualiza a lista de jogadores
                    jogadorList.clear(); // Limpa a lista anterior
                    if (!sbcList.isEmpty()) {
                        jogadorList.addAll(sbcList.get(0).getLista());
                    }
                    

                    JButton btnNewButton_1 = new JButton("1");
                    btnNewButton_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            DefaultListModel<String> listModelBtn = new DefaultListModel<>();
                            for (Jogador jogador : jogadorList) {
                                listModelBtn.addElement(jogador.toString());
                            }
                            list.setModel(listModelBtn);
                            list.revalidate();
                        }
                    });
                    btnNewButton_1.setBounds(109, 17, 41, 23);
                    desktopPane.add(btnNewButton_1);
                    JButton btnNewButton_2 = new JButton("2");
                    btnNewButton_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            DefaultListModel<String> listModelBtn = new DefaultListModel<>();
                            for (Jogador jogador : jogadorList) {
                                listModelBtn.addElement(jogador.toString());
                            }
                            list.setModel(listModelBtn);
                            list.revalidate();
                        }
                    });
                    btnNewButton_2.setBounds(147, 17, 39, 23);
                    desktopPane.add(btnNewButton_2);
                    
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(10, 123, 89, 23);
        desktopPane.add(btnNewButton);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(109, 43, 540, 291);
        desktopPane.add(scrollPane);

        list = new JList<>();
        list.setFont(new Font("Monospaced", Font.PLAIN, 14));
        list.setToolTipText("");
        scrollPane.setViewportView(list);

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainWindow();
            }
        });
    }
}