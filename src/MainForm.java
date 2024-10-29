import javax.swing.*;

public class MainForm {
    private JPanel Mainpanel;
    private JTextField txtNome;
    private JLabel lblNome;
    private JButton btnValidar;
    private JLabel txtResultado;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta a minha TV no tamanho do meu painel
        frame.pack();
        frame.setSize( 500, 500);
        //Ligar a TV
        frame.setVisible(true);
    }
}