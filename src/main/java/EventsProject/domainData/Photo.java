package EventsProject.domainData;

public class Photo {
    private Integer id;
    private Urls photo_link;
    private Urls thumb_link;
    private Urls base_url;

    public Photo(Integer id, Urls photo_link, Urls thumb_link, Urls base_url) {
        this.id = id;
        this.photo_link = photo_link;
        this.thumb_link = thumb_link;
        this.base_url = base_url;
    }

    public Photo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Urls getPhoto_link() {
        return photo_link;
    }

    public void setPhoto_link(Urls photo_link) {
        this.photo_link = photo_link;
    }

    public Urls getThumb_link() {
        return thumb_link;
    }

    public void setThumb_link(Urls thumb_link) {
        this.thumb_link = thumb_link;
    }

    public Urls getBase_url() {
        return base_url;
    }

    public void setBase_url(Urls base_url) {
        this.base_url = base_url;
    }
}
