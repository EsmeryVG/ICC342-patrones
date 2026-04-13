package patrones.estructurales.facade;



public class Main {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeperImplementation();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both both = keeper.getVegNonMenu();

        System.out.println(v.showMenu());
        System.out.println(nv.showMenu());
        System.out.println(both.showMenu());
    }
}

