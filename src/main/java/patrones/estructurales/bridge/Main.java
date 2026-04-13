package patrones.estructurales.bridge;

abstract class Vehiculo {
    protected Workshop workShop1;
    protected Workshop workShop2;

    protected Vehiculo(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}

class Carro extends Vehiculo {
    public Carro(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Carro ");
        workShop1.work();
        workShop2.work();
    }
}

class Bicicleta extends Vehiculo {
    public Bicicleta(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Bicicleta ");
        workShop1.work();
        workShop2.work();
    }
}

interface Workshop
{
    abstract public void work();
}

class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Producido");
    }
}

class Assemble implements Workshop {
    @Override
    public void work()
    {
        System.out.print(" Y");
        System.out.println(" Ensamblado.");
    }
}

class BridgePattern {
    public static void main(String[] args)
    {
        Vehiculo Vehiculo1 = new Carro(new Produce(), new Assemble());
        Vehiculo1.manufacture();
        Vehiculo Vehiculo2 = new Bicicleta(new Produce(), new Assemble());
        Vehiculo2.manufacture();
    }
}