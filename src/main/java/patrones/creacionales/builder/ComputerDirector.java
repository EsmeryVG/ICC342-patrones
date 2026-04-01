package patrones.creacionales.builder;

class ComputerDirector {
    public void construct(Builder builder)
    {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}