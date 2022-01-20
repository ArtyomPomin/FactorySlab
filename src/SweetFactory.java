public class SweetFactory {
    public static Sweet produceSweet(String requirement){
        if (requirement == "candy Alenka"){
            return new Candy ("candy Alenka");
        }
        if (requirement == "chocolate cake"){
            return new Cake ("chocolate cake");
        }
        else if (requirement == "icecream")
            return new IceCream ("icecream");
        return null;
    }
}
