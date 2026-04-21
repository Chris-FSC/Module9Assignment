public class Driver {
    public class Driver {
        public static void main(String[] args) {

            
            GarmentFactory professional = new ProfessionalFactory();
            GarmentFactory party = new PartyFactory();
            GarmentFactory casual = new CasualFactory();

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
