package loading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaCarregamento extends JDialog {

    public TelaCarregamento(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void exibir() {
        setVisible(true);
    }

    public void ocultar() {
        setVisible(false);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel labelCarregamento = new JLabel("Processando dados...");
        labelCarregamento.setFont(new Font("Arial", Font.PLAIN, 16));
        labelCarregamento.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(labelCarregamento, BorderLayout.CENTER);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null); // Centraliza na tela
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setSize(400, 300);

            JButton abrirTelaCarregamento = new JButton("Abrir Tela de Carregamento");
            abrirTelaCarregamento.addActionListener((ActionEvent e) -> {
                TelaCarregamento telaCarregamento = new TelaCarregamento(frame, true);
                telaCarregamento.setVisible(true);

                // Simule um processo demorado em uma SwingWorker
                SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        try {
                            Thread.sleep(500); // Simulação de um processo demorado
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        return null;
                    }

                    @Override
                    protected void done() {
                        telaCarregamento.dispose(); // Feche a tela de carregamento quando o processamento estiver concluído
                    }
                };

                worker.execute();
            });

            frame.setLayout(new FlowLayout());
            frame.add(abrirTelaCarregamento);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
