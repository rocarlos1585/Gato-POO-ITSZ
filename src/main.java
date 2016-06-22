import javax.swing.*;

import java.awt.*;

/**
 * Created by rober on 19/04/2016.
 */
public class main {


    public static void main(String [] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {


        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null,"                                           INSTRUCCIONES:\n1- el primer click lo tomara el jugador numero 1 y se le asignara el icono X\n2- el segundo click lo tomara el jugador numero 2 y se le asignara el icono O");
        ventana Ventana = new ventana();

        Ventana.setBounds(500,500,500,500);
        Ventana.setVisible(true);
        Ventana.setResizable(true);

    }
}
