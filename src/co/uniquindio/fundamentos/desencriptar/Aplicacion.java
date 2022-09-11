package co.uniquindio.fundamentos.desencriptar;

import javax.swing.JOptionPane;

/**
 * @author JaemT1
 */
public class Aplicacion {
    public static void main(String[] args) {
        String mensajeEncriptado = obtenerMensaje();
        desencriptar(mensajeEncriptado);
    }
    
    /**
     * Método que desencripta un mensaje 
     * @param mensajeEncriptado el mensaje a desencriptar
     */
    public static void desencriptar(String mensajeEncriptado){
        String mensajeDesencriptado = "";
        char[] mensajeEncriptadoDividido = mensajeEncriptado.toCharArray();
        
        for (int i = 0; i < mensajeEncriptadoDividido.length; i++) {
            mensajeEncriptadoDividido[i] = (char)(mensajeEncriptadoDividido[i]-(char)8);
        }
        mensajeDesencriptado = String.valueOf(mensajeEncriptadoDividido);
        JOptionPane.showMessageDialog(null, "El mensaje desencriptado es: " + mensajeDesencriptado);     
    }
    
    public static String obtenerMensaje(){
        String mensaje = JOptionPane.showInputDialog("Ingrese el mensaje a desencriptar: ");
        return mensaje;
    }
}

