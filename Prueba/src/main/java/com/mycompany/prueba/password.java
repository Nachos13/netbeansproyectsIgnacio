package com.mycompany.prueba;
import java.util.Random;
public class password {
  private int longitud;
    private String contrasena;

    // Constructores

    /**
     * Constructor por defecto. Pone la longitud a 0 y la cadena vacía.
     */
    public password(){
        longitud = 8;
        contrasena = "";
    }

    /**
     * Se construye una cadena aleatoria con la longitud dada.
     *
     * @param longitud Longitud de la cadena.
     */
    public password(int longitud){
        this.longitud = longitud;
         this.contrasena = this.generarPassword();
    }

    /**
     * Este constructor se utilizará cuando queramos asignar una
     * contraseña determinada. No generada aleatoriamente.
     *
     * @param contrasena
     */
    public password(String contrasena){
        this.longitud = contrasena.length();
        this.contrasena = contrasena;
    }
    // Accesores

    /**
     * Setter para establecer el atributo longitud.
     *
     * @param longitud Valor entero que indicará la longitud de la contraseña.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        // Debería truncar la contraseña
    }
    public int getLongitud() {

        return longitud;
    }

    /**
     * Getter del atributo contrasena.
     *
     * @return La constraseña.
     */
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }


    public String generarPassword(){
        final char[] caracteres =
                {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                        'Q','R','S','T','U','V','W','X', 'Y','Z',
                        'a','b','c','d','e','f','g','e','h','i','j','l','k','m',
                        'n','o','p','r','s','t','u','v','w','x','y','z',
                        '1','2','3','4','5','6','7','8','9','0',
                        '@','#','!','$','€','&','[',']'};

        // Esta cadena guardará al final del método la contraseña generada aleatoriamente
        String temporal = "";

        Random aleatorio = new Random();

        // Iteramos tantas veces como longitud de caracteres debe tener la contraseña
        for(int i = 0; i < this.longitud ; i++){
            
            temporal += caracteres[aleatorio.nextInt(caracteres.length)];
        }

        return temporal;
    }
    public String toString(){
        return "Longitud: "+this.longitud+" Password: "+this.contrasena;
    }
          }

    
