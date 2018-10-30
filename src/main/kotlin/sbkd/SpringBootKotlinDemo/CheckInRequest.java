package sbkd.SpringBootKotlinDemo;

public class CheckInRequest {
    private String hotelName;
    private int nbGuests;

    public int getNbGuests() {
        return nbGuests;
    }

    public void setNbGuests(int nbGuests) {
        this.nbGuests = nbGuests;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
