public class Driver {
    public class Driver {
        public static void main(String[] args) {

            // Choose a garment family (variant)
            GarmentFactory factory = new ProfessionalFactory();
            // Try switching to: new CasualFactory() or new PartyFactory()

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
