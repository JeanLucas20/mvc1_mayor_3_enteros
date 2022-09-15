package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    // ------------
    // Atributos
    // ------------
    private PanelEntrada miPanelEntrada;
    private PanelOperaciones miPanelOperaciones;


    // ------------
    // Métodos
    // ------------

    // Método constructor
    public VentanaPrincipal(){
        // Definición del contenedor de la ventana
        this.setLayout(null);
        
        // Creación y adición de un panel tipo PanelEntrada
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10,10, 470, 200);
        this.add(miPanelEntrada);

        // Características de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        // this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,207, 470, 70);
        this.add(miPanelOperaciones);

    }
}

