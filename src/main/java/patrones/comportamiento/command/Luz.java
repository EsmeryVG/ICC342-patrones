package patrones.comportamiento.command;

// Clase Receiver:
// Contiene la lógica real que se ejecuta
class Luz {

    public void encender() {
        System.out.println("Luz encendida");
    }

    public void apagar() {
        System.out.println("Luz apagada");
    }
}