package cdac.in;

public class Main {
    public static void main(String[] args) {
        DirectChaining dc = new DirectChaining(15);
        dc.insertValue("Delhi");
        dc.insertValue("is");
        dc.insertValue("a");
        dc.insertValue("capital");
        dc.insertValue("0f");
        dc.insertValue("India");

        dc.displayHashTable();
    }
}
