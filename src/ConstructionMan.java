public class ConstructionMan {
    public static void main(String[] args) {
        Sweet sweet1 = SweetFactory.produceSweet("candy Alenka");
        Sweet sweet2 = SweetFactory.produceSweet("chocolate cake");
        Sweet sweet3 = SweetFactory.produceSweet("icecream");


        System.out.println(sweet1);
        System.out.println(sweet2);
        System.out.println(sweet3);
    }
}
