import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

/**
 * Created by rober on 19/04/2016.
 */
public class ventana extends JFrame {

    int contador=0;
    int bandera=0;

    //declaro las bariables con 1 espacio y 2 espacios respectivamente para que la impreion no interfiera con la imagen
    String j1=" ";
    String j2="  ";

     JLabel texto1, texto2;
     JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
     JTextField Tbox;

    //declaro objetos para poner imagen de x & o
    ImageIcon iconx = new ImageIcon("correcion x.png");
    ImageIcon icono = new ImageIcon("correcion o.png");
    ImageIcon iconHC = new ImageIcon("hablemos codigo.png");

    public ventana(){

        super ("hablemos codigo");
        setSize(400,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();

        //se define el tipo de acomodo que se le va a dar a los componentes de la pantalla gridlayout se le tiene que poner numero de filas y columnas (#, #)
        GridLayout gl = new GridLayout(3,3);

        //definimos el espacio que se le da entre cada boton
        gl.setHgap(5);
        gl.setHgap(5);

        cp.setLayout(gl);



        //se agregan caracteristicas a los 9 botones que voy a necesitar
        boton1 = new JButton();
        boton1.setIcon(iconHC);
        boton1.addActionListener(new listenerbotons());

        boton2 = new JButton();
        boton2.setIcon(iconHC);
        boton2.addActionListener(new listenerbotons());

        boton3 = new JButton();
        boton3.setIcon(iconHC);
        boton3.addActionListener(new listenerbotons());

        boton4 = new JButton();
        boton4.setIcon(iconHC);
        boton4.addActionListener(new listenerbotons());

        boton5 = new JButton();
        boton5.setIcon(iconHC);
        boton5.addActionListener(new listenerbotons());

        boton6 = new JButton();
        boton6.setIcon(iconHC);
        boton6.addActionListener(new listenerbotons());

        boton7 = new JButton();
        boton7.setIcon(iconHC);
        boton7.addActionListener(new listenerbotons());

        boton8 = new JButton();
        boton8.setIcon(iconHC);
        boton8.addActionListener(new listenerbotons());

        boton9 = new JButton();
        boton9.setIcon(iconHC);
        boton9.addActionListener(new listenerbotons());



        //en esta parte los botones son agregados a la ventana
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        }



    /**nota 1: el incremento lo puedes poner antes de las condicionales de las lineas y diagonales y al ultimo la condicional de que si el contador es == a 9*/

    //inicio la clase que va a tomar el evento del listener
    public class listenerbotons implements ActionListener{

        //delcaro el metodo encargado de ejecutar el listener dentro de cada uno de los botones
        public void actionPerformed(ActionEvent e) {

                        if (e.getSource() .equals(boton1)) {

                            if(contador<9){

                                contador++;
                                /*boton1.addActionListener(new Action() {
                                    public Object getValue(String key) {
                                        return null;
                                    }

                                    public void putValue(String key, Object value) {

                                    }

                                    public void setEnabled(boolean b) {

                                    }

                                    public boolean isEnabled() {
                                        return false;
                                    }

                                    public void addPropertyChangeListener(PropertyChangeListener listener) {

                                    }

                                    public void removePropertyChangeListener(PropertyChangeListener listener) {

                                    }

                                    public void actionPerformed(ActionEvent e) {

                                    }
                                });*/

                                boton1.setEnabled(false);


                                if(bandera==0){
                                    boton1.setText(" ");
                                    boton1.setIcon(iconx);
                                    //esta fucion es para devolver el color  los botones
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");

                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                else if(bandera==1){
                                    boton1.setText("  ");
                                    boton1.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");

                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");

                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }

                                }


                                System.out.println(contador);
                            }
                        }


                   else if (e.getSource() .equals(boton2)) {
                            if(contador<9){

                                contador++;
                                boton2.setEnabled(false);

                                if(bandera==0){
                                    boton2.setText(" ");
                                    boton2.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");

                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");

                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                else if(bandera==1){
                                    boton2.setText("  ");
                                    boton2.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");

                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }


                                System.out.println(contador);
                            }
                   }

                   else if (e.getSource() .equals(boton3)){
                            if(contador<9){

                                contador++;
                                boton3.setEnabled(false);

                                if(bandera==0){
                                    boton3.setText(" ");
                                    boton3.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                else if(bandera==1){
                                    boton3.setText("  ");
                                    boton3.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");

                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }

                                }


                                System.out.println(contador);

                            }

                        }
                   else if (e.getSource() .equals(boton4)){
                            if(contador<9){

                                contador++;
                                boton4.setEnabled(false);

                                if(bandera==0){
                                    boton4.setText(" ");
                                    boton4.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                else if(bandera==1){
                                    boton4.setText("  ");
                                    boton4.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }


                                System.out.println(contador);


                            }


                        }
                   else if (e.getSource() .equals(boton5)){
                            if(contador<9){

                                contador++;
                                boton5.setEnabled(false);

                                if(bandera==0){
                                    boton5.setText(" ");
                                    boton5.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");

                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                       // JOptionPane.showMessageDialog(null,"gano el jugador 2");

                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                else if(bandera==1){
                                    boton5.setText("  ");
                                    boton5.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");

                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");


                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                System.out.println(contador);

                            }


                        }
                   else if (e.getSource() .equals(boton6)){
                            if(contador<9){

                                contador++;
                                boton6.setEnabled(false);

                                if(bandera==0){
                                    boton6.setText(" ");
                                    boton6.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                else if(bandera==1){
                                    boton6.setText("  ");
                                    boton6.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                System.out.println(contador);
                            }

                        }

                   else if (e.getSource() .equals(boton7)){
                            if(contador<9){

                                contador++;
                                boton7.setEnabled(false);

                                if(bandera==0){
                                    boton7.setText(" ");
                                    boton7.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                       // JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }

                                }

                                else if(bandera==1){
                                    boton7.setText("  ");
                                    boton7.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                       // JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }


                                System.out.println(contador);
                            }


                        }

                   else if (e.getSource() .equals(boton8)){
                            if(contador<9){

                                contador++;
                                boton8.setEnabled(false);

                                if(bandera==0){
                                    boton8.setText(" ");
                                    boton8.setIcon(iconx);
                                    bandera=1;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }

                                }

                                else if(bandera==1){
                                    boton8.setText("  ");
                                    boton8.setIcon(icono);
                                    bandera=0;

                                    if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                    }

                                    else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                    }

                                    else if(contador==9){

                                        int confirmacion =JOptionPane.YES_NO_OPTION;
                                        JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                        if(confirmacion == JOptionPane.YES_OPTION){
                                            boton1.setEnabled(true);
                                            boton1.setText(null);
                                            boton1.setIcon(iconHC);

                                            boton2.setEnabled(true);
                                            boton2.setText(null);
                                            boton2.setIcon(iconHC);

                                            boton3.setEnabled(true);
                                            boton3.setText(null);
                                            boton3.setIcon(iconHC);

                                            boton4.setEnabled(true);
                                            boton4.setText(null);
                                            boton4.setIcon(iconHC);

                                            boton5.setEnabled(true);
                                            boton5.setText(null);
                                            boton5.setIcon(iconHC);

                                            boton6.setEnabled(true);
                                            boton6.setText(null);
                                            boton6.setIcon(iconHC);

                                            boton7.setEnabled(true);
                                            boton7.setText(null);
                                            boton7.setIcon(iconHC);

                                            boton8.setEnabled(true);
                                            boton8.setText(null);
                                            boton8.setIcon(iconHC);

                                            boton9.setEnabled(true);
                                            boton9.setText(null);
                                            boton9.setIcon(iconHC);

                                            contador=0;
                                            bandera=0;
                                        }
                                        //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                    }
                                }

                                System.out.println(contador);
                            }


                        }

                   else if (e.getSource() .equals(boton9)){
                            if(contador<9){

                                    contador++;
                                    boton9.setEnabled(false);

                                    if(bandera==0){
                                        boton9.setText(" ");
                                        boton9.setIcon(iconx);
                                        bandera=1;

                                        if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j1  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j1  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j1  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j1  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j1  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j1){

                                            int confirmacion =JOptionPane.YES_NO_OPTION;
                                            JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                            if(confirmacion == JOptionPane.YES_OPTION){
                                                boton1.setEnabled(true);
                                                boton1.setText(null);
                                                boton1.setIcon(iconHC);

                                                boton2.setEnabled(true);
                                                boton2.setText(null);
                                                boton2.setIcon(iconHC);

                                                boton3.setEnabled(true);
                                                boton3.setText(null);
                                                boton3.setIcon(iconHC);

                                                boton4.setEnabled(true);
                                                boton4.setText(null);
                                                boton4.setIcon(iconHC);

                                                boton5.setEnabled(true);
                                                boton5.setText(null);
                                                boton5.setIcon(iconHC);

                                                boton6.setEnabled(true);
                                                boton6.setText(null);
                                                boton6.setIcon(iconHC);

                                                boton7.setEnabled(true);
                                                boton7.setText(null);
                                                boton7.setIcon(iconHC);

                                                boton8.setEnabled(true);
                                                boton8.setText(null);
                                                boton8.setIcon(iconHC);

                                                boton9.setEnabled(true);
                                                boton9.setText(null);
                                                boton9.setIcon(iconHC);

                                                contador=0;
                                                bandera=0;
                                            }
                                            //JOptionPane.showMessageDialog(null,"gano el jugador 1");
                                        }

                                        else if(/*linea del b1 al b3*/ boton1.getText()==boton2.getText()&&boton3.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*diagonal del b1 al b9 */ boton1.getText()==boton5.getText()&&boton9.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b1 al b7*/ boton1.getText()==boton4.getText()&&boton7.getText()==boton1.getText()&&boton1.getText()==j2  ||  /*linea del b7 al b9*/ boton7.getText()==boton8.getText()&&boton9.getText()==boton7.getText()&&boton7.getText()==j2  ||  /*linea del b3 al b9*/ boton3.getText()==boton6.getText()&&boton9.getText()==boton3.getText()&&boton3.getText()==j2  || /*columna del b2 al b8 */ boton2.getText()==boton5.getText()&&boton8.getText()==boton2.getText()&&boton2.getText()==j2  ||   /* diagonal del b3 al b7 */ boton3.getText()==boton5.getText()&&boton7.getText()==boton3.getText()&&boton3.getText()==j2  ||  /*fila del b4 al b6 */ boton4.getText()==boton5.getText()&&boton6.getText()==boton4.getText()&&boton4.getText()==j2){

                                            int confirmacion =JOptionPane.YES_NO_OPTION;
                                            JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                            if(confirmacion == JOptionPane.YES_OPTION){
                                                boton1.setEnabled(true);
                                                boton1.setText(null);
                                                boton1.setIcon(iconHC);

                                                boton2.setEnabled(true);
                                                boton2.setText(null);
                                                boton2.setIcon(iconHC);

                                                boton3.setEnabled(true);
                                                boton3.setText(null);
                                                boton3.setIcon(iconHC);

                                                boton4.setEnabled(true);
                                                boton4.setText(null);
                                                boton4.setIcon(iconHC);

                                                boton5.setEnabled(true);
                                                boton5.setText(null);
                                                boton5.setIcon(iconHC);

                                                boton6.setEnabled(true);
                                                boton6.setText(null);
                                                boton6.setIcon(iconHC);

                                                boton7.setEnabled(true);
                                                boton7.setText(null);
                                                boton7.setIcon(iconHC);

                                                boton8.setEnabled(true);
                                                boton8.setText(null);
                                                boton8.setIcon(iconHC);

                                                boton9.setEnabled(true);
                                                boton9.setText(null);
                                                boton9.setIcon(iconHC);

                                                contador=0;
                                                bandera=0;
                                            }
                                            //JOptionPane.showMessageDialog(null,"gano el jugador 2");
                                        }

                                        else if(contador==9){

                                            int confirmacion =JOptionPane.YES_NO_OPTION;
                                            JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                            if(confirmacion == JOptionPane.YES_OPTION){
                                                boton1.setEnabled(true);
                                                boton1.setText(null);
                                                boton1.setIcon(iconHC);

                                                boton2.setEnabled(true);
                                                boton2.setText(null);
                                                boton2.setIcon(iconHC);

                                                boton3.setEnabled(true);
                                                boton3.setText(null);
                                                boton3.setIcon(iconHC);

                                                boton4.setEnabled(true);
                                                boton4.setText(null);
                                                boton4.setIcon(iconHC);

                                                boton5.setEnabled(true);
                                                boton5.setText(null);
                                                boton5.setIcon(iconHC);

                                                boton6.setEnabled(true);
                                                boton6.setText(null);
                                                boton6.setIcon(iconHC);

                                                boton7.setEnabled(true);
                                                boton7.setText(null);
                                                boton7.setIcon(iconHC);

                                                boton8.setEnabled(true);
                                                boton8.setText(null);
                                                boton8.setIcon(iconHC);

                                                boton9.setEnabled(true);
                                                boton9.setText(null);
                                                boton9.setIcon(iconHC);

                                                contador=0;
                                                bandera=0;
                                            }
                                            //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                        }
                                    }

                                    else if(bandera==1) {
                                        boton9.setText("  ");
                                        boton9.setIcon(icono);
                                        bandera = 0;

                                        if (/*linea del b1 al b3*/ boton1.getText() == boton2.getText() && boton3.getText() == boton1.getText() && boton1.getText() == j1 ||  /*diagonal del b1 al b9 */ boton1.getText() == boton5.getText() && boton9.getText() == boton1.getText() && boton1.getText() == j1 ||  /*linea del b1 al b7*/ boton1.getText() == boton4.getText() && boton7.getText() == boton1.getText() && boton1.getText() == j1 ||  /*linea del b7 al b9*/ boton7.getText() == boton8.getText() && boton9.getText() == boton7.getText() && boton7.getText() == j1 ||  /*linea del b3 al b9*/ boton3.getText() == boton6.getText() && boton9.getText() == boton3.getText() && boton3.getText() == j1 || /*columna del b2 al b8 */ boton2.getText() == boton5.getText() && boton8.getText() == boton2.getText() && boton2.getText() == j1 ||   /* diagonal del b3 al b7 */ boton3.getText() == boton5.getText() && boton7.getText() == boton3.getText() && boton3.getText() == j1 ||  /*fila del b4 al b6 */ boton4.getText() == boton5.getText() && boton6.getText() == boton4.getText() && boton4.getText() == j1) {

                                            int confirmacion =JOptionPane.YES_NO_OPTION;
                                            JOptionPane.showConfirmDialog(null, "El jugador 1 ha ganado.\n¿Desea reiniciar el juego?");
                                            if(confirmacion == JOptionPane.YES_OPTION){
                                                boton1.setEnabled(true);
                                                boton1.setText(null);
                                                boton1.setIcon(iconHC);

                                                boton2.setEnabled(true);
                                                boton2.setText(null);
                                                boton2.setIcon(iconHC);

                                                boton3.setEnabled(true);
                                                boton3.setText(null);
                                                boton3.setIcon(iconHC);

                                                boton4.setEnabled(true);
                                                boton4.setText(null);
                                                boton4.setIcon(iconHC);

                                                boton5.setEnabled(true);
                                                boton5.setText(null);
                                                boton5.setIcon(iconHC);

                                                boton6.setEnabled(true);
                                                boton6.setText(null);
                                                boton6.setIcon(iconHC);

                                                boton7.setEnabled(true);
                                                boton7.setText(null);
                                                boton7.setIcon(iconHC);

                                                boton8.setEnabled(true);
                                                boton8.setText(null);
                                                boton8.setIcon(iconHC);

                                                boton9.setEnabled(true);
                                                boton9.setText(null);
                                                boton9.setIcon(iconHC);

                                                contador=0;
                                                bandera=0;
                                            }
                                            //JOptionPane.showMessageDialog(null, "gano el jugador 1");
                                        }
                                        else if (/*linea del b1 al b3*/ boton1.getText() == boton2.getText() && boton3.getText() == boton1.getText() && boton1.getText() == j2 ||  /*diagonal del b1 al b9 */ boton1.getText() == boton5.getText() && boton9.getText() == boton1.getText() && boton1.getText() == j2 ||  /*linea del b1 al b7*/ boton1.getText() == boton4.getText() && boton7.getText() == boton1.getText() && boton1.getText() == j2 ||  /*linea del b7 al b9*/ boton7.getText() == boton8.getText() && boton9.getText() == boton7.getText() && boton7.getText() == j2 ||  /*linea del b3 al b9*/ boton3.getText() == boton6.getText() && boton9.getText() == boton3.getText() && boton3.getText() == j2 || /*columna del b2 al b8 */ boton2.getText() == boton5.getText() && boton8.getText() == boton2.getText() && boton2.getText() == j2 ||   /* diagonal del b3 al b7 */ boton3.getText() == boton5.getText() && boton7.getText() == boton3.getText() && boton3.getText() == j2 ||  /*fila del b4 al b6 */ boton4.getText() == boton5.getText() && boton6.getText() == boton4.getText() && boton4.getText() == j2) {

                                            int confirmacion =JOptionPane.YES_NO_OPTION;
                                            JOptionPane.showConfirmDialog(null, "El jugador 2 ha ganado.\n¿Desea reiniciar el juego?");
                                            if(confirmacion == JOptionPane.YES_OPTION){
                                                boton1.setEnabled(true);
                                                boton1.setText(null);
                                                boton1.setIcon(iconHC);

                                                boton2.setEnabled(true);
                                                boton2.setText(null);
                                                boton2.setIcon(iconHC);

                                                boton3.setEnabled(true);
                                                boton3.setText(null);
                                                boton3.setIcon(iconHC);

                                                boton4.setEnabled(true);
                                                boton4.setText(null);
                                                boton4.setIcon(iconHC);

                                                boton5.setEnabled(true);
                                                boton5.setText(null);
                                                boton5.setIcon(iconHC);

                                                boton6.setEnabled(true);
                                                boton6.setText(null);
                                                boton6.setIcon(iconHC);

                                                boton7.setEnabled(true);
                                                boton7.setText(null);
                                                boton7.setIcon(iconHC);

                                                boton8.setEnabled(true);
                                                boton8.setText(null);
                                                boton8.setIcon(iconHC);

                                                boton9.setEnabled(true);
                                                boton9.setText(null);
                                                boton9.setIcon(iconHC);

                                                contador=0;
                                                bandera=0;
                                            }
                                            //JOptionPane.showMessageDialog(null, "gano el jugador 2");
                                        }

                                        else if(contador==9){

                                            int confirmacion =JOptionPane.YES_NO_OPTION;
                                            JOptionPane.showConfirmDialog(null, "Nadie ha ganado, es un empate\n¿Desea reiniciar el juego?");
                                            if(confirmacion == JOptionPane.YES_OPTION){
                                                boton1.setEnabled(true);
                                                boton1.setText(null);
                                                boton1.setIcon(iconHC);

                                                boton2.setEnabled(true);
                                                boton2.setText(null);
                                                boton2.setIcon(iconHC);

                                                boton3.setEnabled(true);
                                                boton3.setText(null);
                                                boton3.setIcon(iconHC);

                                                boton4.setEnabled(true);
                                                boton4.setText(null);
                                                boton4.setIcon(iconHC);

                                                boton5.setEnabled(true);
                                                boton5.setText(null);
                                                boton5.setIcon(iconHC);

                                                boton6.setEnabled(true);
                                                boton6.setText(null);
                                                boton6.setIcon(iconHC);

                                                boton7.setEnabled(true);
                                                boton7.setText(null);
                                                boton7.setIcon(iconHC);

                                                boton8.setEnabled(true);
                                                boton8.setText(null);
                                                boton8.setIcon(iconHC);

                                                boton9.setEnabled(true);
                                                boton9.setText(null);
                                                boton9.setIcon(iconHC);

                                                contador=0;
                                                bandera=0;
                                            }
                                            //JOptionPane.showMessageDialog(null, "nadie gano, hubo un empate");
                                        }
                                    }


                                System.out.println(contador);
                            }

                        }
                   }

        }
    }