class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPickups() {
        return numOfPickups;
    }

    void setNumOfPickups(int num) {

        numOfPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;

    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

}

public class ElectricGuitarTest {

    public static void main(String[] args) {

        ElectricGuitar guitar = new ElectricGuitar();

        guitar.setBrand("Yamaha");
        guitar.setNumOfPickups(3);
        guitar.setRockStarUsesIt(false);

        System.out.println(guitar.getBrand());
        System.out.println(guitar.getNumOfPickups());
        System.out.println(guitar.getRockStarUsesIt());

    }

}
