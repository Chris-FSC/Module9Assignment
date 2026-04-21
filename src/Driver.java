public class Driver {
    public class Driver {
        public static void main(String[] args) {

            
            GarmentFactory factory = new ProfessionalFactory();
            GarmentFactory factory = new PartyFactory();
            GarmentFactory factory = new CasualFactory();

            Top top = factory.createTop();
            Pants pants = factory.createPants();
            Shoes shoes = factory.createShoes();

            System.out.println("Your outfit includes:");
            System.out.println("- " + top.getDescription());
            System.out.println("- " + pants.getDescription());
            System.out.println("- " + shoes.getDescription());
        }
    }

}
