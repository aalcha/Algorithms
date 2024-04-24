public class HelloGoodbye {
    public static void main(String[] args) {
        String helloString = "Hello ";
        String goodbyeString = "";
        for(String arg : args) {
            helloString = helloString+ arg + " and ";
            goodbyeString = arg + " and " + goodbyeString;
        }
        goodbyeString = "Goodbye " + goodbyeString;
        helloString = helloString.substring(0, helloString.length()-4);
        goodbyeString = goodbyeString.substring(0, goodbyeString.length()-4);
        System.out.println(helloString);
        System.out.println(goodbyeString);
    }
}