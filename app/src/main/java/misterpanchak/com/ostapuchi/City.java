package misterpanchak.com.ostapuchi;

public class City {
    private String Name;
    private String imgUrl;
    private int location;
    private String desctription;



    public City(String name, String imgUrl, int location, String desctriptionk) {
        Name = name;
        imgUrl = imgUrl;

        this.location = location;
        this.desctription = desctription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
       imgUrl = imgUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getDesctription() {
        return desctription;
    }

    public void setDesctription(String desctriptionk) {
        this.desctription = desctriptionk;
    }
}
