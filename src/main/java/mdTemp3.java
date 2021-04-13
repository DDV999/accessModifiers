public class mdTemp3 {

    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    mdTemp3() {
        mdTemp3.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Начиная с " +
                mdTemp3.getCount() + " экземпляра");
        for (int i = 0; i < 500; ++i){
            new mdTemp3();
        }
        System.out.println("Создано " +
                mdTemp3.getCount() + " экземпляров");
    }
}