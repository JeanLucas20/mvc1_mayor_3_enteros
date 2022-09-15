package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones  extends JPanel{
    private JButton bthallarMayor;
    private JButton btBorrar;
    private JButton btSalir;



    public PanelOperaciones(){

        this.setLayout(null);
        this.setBackground(Color.black);

    //Crear y agregar boton HallarMayor
    bthallarMayor = new JButton("Hallar Mayor" );
    bthallarMayor.setFont(new Font("CHILLER",Font.ROMAN_BASELINE,25));
    bthallarMayor.setBounds(20,30,130,30);
    this.add(bthallarMayor);

    //Crear y agregar boton Borrar
    btBorrar = new JButton("Borrar");
    btBorrar.setFont(new Font("CHILLER",Font.ROMAN_BASELINE,25));
    btBorrar.setBounds(174,30,120,30);
    this.add(btBorrar);

    //Crear y agregar boton Salir
    btSalir = new JButton("Salir");
    btSalir.setFont(new Font("CHILLER",Font.ROMAN_BASELINE,25));
    btSalir.setBounds(321,30,120,30);
    this.add(btSalir);
    
    TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
    borde.setTitleColor(Color.white);
    this.setBorder(borde);
    }
}

