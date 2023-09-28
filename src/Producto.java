import javax.swing.*;

public class Producto {
    JFrame frame = new JFrame();
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void mostrarVentana(){
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
