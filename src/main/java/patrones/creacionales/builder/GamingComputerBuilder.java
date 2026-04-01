package patrones.creacionales.builder;

class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();

    public void buildCPU()
    {
        computer.setCPU("i9 gen 14");
    }

    public void buildRAM() { computer.setRAM("32GB DDR5"); }

    public void buildStorage()
    {
        computer.setStorage("2TB SSD");
    }

    public Computer getResult() { return computer; }
}