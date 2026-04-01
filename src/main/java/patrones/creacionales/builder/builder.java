package patrones.creacionales.builder;

interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}