package EventsProject.domainData;

public class Organizers {

    private Integer id;
    private String name;
    private String status;
    private String city;
    private String country;
    private Photo photo;
    private GroupProfile groupProfile;

    public Organizers(Integer id, String name, String status, String city, String country, Photo photo, GroupProfile groupProfile) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.city = city;
        this.country = country;
        this.photo = photo;
        this.groupProfile = groupProfile;
    }

    public Organizers() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public GroupProfile getGroupProfile() {
        return groupProfile;
    }

    public void setGroupProfile(GroupProfile groupProfile) {
        this.groupProfile = groupProfile;
    }
}
