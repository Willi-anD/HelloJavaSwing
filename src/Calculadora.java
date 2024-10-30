import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JTextField txtResultado;
    private JButton btnLimpar;
    private JPanel panelMain;

    public Calculadora() {

        btnSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Peguei informação da tela
                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //Processei
                Integer resultado = primeiro + segundo;

                //Mandei pra tela o resultado
                txtResultado.setText(resultado.toString());

                System.out.println(primeiro);
                System.out.println(segundo);


            }
        });
    }

            public static void main(String[] args) {

                JFrame frame = new JFrame("Minha Calculadora");
                frame.setContentPane(new Calculadora().panelMain);
                frame.setSize(200, 400);
                frame.setVisible(true);
            }

        }