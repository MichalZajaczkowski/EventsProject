package EventsProject.domainData;

public class Event {

    private Integer id;
    private String name;
    private String status;
    private String local_date;
    private String local_time;
    private boolean is_online_event;
    private Urls link;
    private String description;
    private String visibility;
    private boolean  member_pay_fee;
    private Group group;

    public Event() {
    }

    public Event(Integer id, String name, String status, String local_date, String local_time, boolean is_online_event, Urls link, String description, String visibility, boolean member_pay_fee, Group group) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.local_date = local_date;
        this.local_time = local_time;
        this.is_online_event = is_online_event;
        this.link = link;
        this.description = description;
        this.visibility = visibility;
        this.member_pay_fee = member_pay_fee;
        this.group = group;
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

    public String getLocal_date() {
        return local_date;
    }

    public void setLocal_date(String local_date) {
        this.local_date = local_date;
    }

    public String getLocal_time() {
        return local_time;
    }

    public void setLocal_time(String local_time) {
        this.local_time = local_time;
    }

    public boolean isIs_online_event() {
        return is_online_event;
    }

    public void setIs_online_event(boolean is_online_event) {
        this.is_online_event = is_online_event;
    }

    public Urls getLink() {
        return link;
    }

    public void setLink(Urls link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public boolean isMember_pay_fee() {
        return member_pay_fee;
    }

    public void setMember_pay_fee(boolean member_pay_fee) {
        this.member_pay_fee = member_pay_fee;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
