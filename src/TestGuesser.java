public class TestGuesser {
    public static void main(String[] args) {
        Guesser g1 = new Guesser(0, 1000);

        if(g1.toString().equals("Low: 0\nHigh: 1000")){
            System.out.println("Test passed");
        }
        else{
            System.err.println("Test failed");
        }
    }
}
