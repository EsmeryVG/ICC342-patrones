package patrones.creacionales.builder;

class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setCPU(String cpu) { this.cpu = cpu; }

    public void setRAM(String ram) { this.ram = ram; }

    public void setStorage(String storage)
    {
        this.storage = storage;
    }

    public void displayInfo()
    {
        System.out.println("Especificaciones de la Computadora:\n"
                           + "CPU: " + cpu + "\n"
                           + "RAM: " + ram + "\n"
                           + "Almacenamiento: " + storage + "\n");
    }
}