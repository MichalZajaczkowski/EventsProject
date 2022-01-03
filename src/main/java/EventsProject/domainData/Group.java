package EventsProject.domainData;

public class Group {
    private Integer id;
    private String name;
    private String join_mode;
    private String urlname;
    private String who;
    private String localized_location;
    private String country;
    private String region;
    private String timezone;
    private String status;
    private Integer members;
    private String intro;
    private Urls link;

    public Group(Integer id, String name, String join_mode, String urlname, String who, String localized_location, String country, String region, String timezone, String status, Integer members, String intro, Urls link) {
        this.id = id;
        this.name = name;
        this.join_mode = join_mode;
        this.urlname = urlname;
        this.who = who;
        this.localized_location = localized_location;
        this.country = country;
        this.region = region;
        this.timezone = timezone;
        this.status = status;
        this.members = members;
        this.intro = intro;
        this.link = link;
    }

    public Group() {
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

    public String getJoin_mode() {
        return join_mode;
    }

    public void setJoin_mode(String join_mode) {
        this.join_mode = join_mode;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getLocalized_location() {
        return localized_location;
    }

    public void setLocalized_location(String localized_location) {
        this.localized_location = localized_location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Urls getLink() {
        return link;
    }

    public void setLink(Urls link) {
        this.link = link;
    }
}
