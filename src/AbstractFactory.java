public interface AbstractFactory {
    public interface GarmentFactory {
        Top createTop();
        Pants createPants();
        Shoes createShoes();
    }

}
