public class ProfessionFactory implements AbstractFactory {
    public class ProfessionalFactory implements GarmentFactory {

        @Override
        public Top createTop() {
            return new ProfessionalTops();
        }

        @Override
        public Pants createPants() {
            return new ProfessionalPants();
        }

        @Override
        public Shoes createShoes() {
            return new ProfessionalShoes();
        }
    }

}