package EventsProject.domainData;

public class GroupProfile {
    private String status;
    private String role;

    public GroupProfile(String status, String role) {
        this.status = status;
        this.role = role;
    }

    public GroupProfile() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
