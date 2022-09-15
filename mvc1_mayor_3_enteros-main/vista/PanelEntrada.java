package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada  extends JPanel{
    
    // ------------
    // Atributos
    // ------------
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JTextField textX;
    private JTextField textY;
    private JTextField textZ;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;




    // ------------
    // Métodos
    // ------------

    // Método constructor
    public PanelEntrada(){
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.black);

        
        // Crear y agreagar etiqueta para título
        lbTitulo = new JLabel("Mayor 3 enteros", JLabel.CENTER);
        lbTitulo.setFont(new Font("CHILLER",Font.BOLD,40));
        lbTitulo.setForeground(Color.red);
        lbTitulo.setBounds(20,10,430,40);
        this.add(lbTitulo);

        // Crear y agregar etiquetas para las variables
        lbX = new JLabel("X :", JLabel.CENTER);
        lbX.setFont(new Font("CHILLER",Font.BOLD,25));
        lbX.setForeground(Color.white);
        lbX.setBounds(0,70,120,20);
        this.add(lbX);

        lbY = new JLabel("Y :", JLabel.CENTER);
        lbY.setFont(new Font("CHILLER",Font.BOLD,25));
        lbY.setForeground(Color.white);
        lbY.setBounds(0,100,120,20);
        this.add(lbY);

        lbZ = new JLabel("Z :", JLabel.CENTER);
        lbZ.setFont(new Font("CHILLER",Font.BOLD,25));
        lbZ.setForeground(Color.white);
        lbZ.setBounds(0,130,120,20);
        this.add(lbZ);

        iImagen = new ImageIcon(getClass().getResource("messi.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(300, 58, 100, 100);
        this.add(lbImagen);

        tfx = new JTextField();
        tfx.setFont(new Font("Arial", Font.PLAIN, 18));
        tfx.setForeground(Color.BLACK);
        tfx.setBounds(84, 72, 60, 24);
        this.add(tfx);

        tfy = new JTextField();
        tfy.setFont(new Font("Arial", Font.PLAIN, 18));
        tfy.setForeground(Color.BLACK);
        tfy.setBounds(84, 103, 60, 24);
        this.add(tfy);

        tfz = new JTextField();
        tfz.setFont(new Font("Arial", Font.PLAIN, 18));
        tfz.setForeground(Color.BLACK);
        tfz.setBounds(84, 133, 60, 24);
        this.add(tfz);

        // Borde y título
        TitledBorder borde = BorderFactory.createTitledBorder("Datos entrada");
        borde.setTitleColor(Color.white);
        this.setBorder(borde);
    }
}
