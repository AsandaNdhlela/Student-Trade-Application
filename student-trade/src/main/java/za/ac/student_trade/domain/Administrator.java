package za.ac.student_trade.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "administrator")
public class Administrator {

    @Id
    @Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "reviewedBy")
    private List<PendingProducts> reviewedRequests;


    public Administrator() {
    }

    protected Administrator(Builder builder) {}

    public Long getAdminId() {
        return adminId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<PendingProducts> getReviewedRequests() {
        return reviewedRequests;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adminId=" + adminId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", reviewedRequests=" + reviewedRequests +
                '}';
    }

    public static class Builder {
        private Long adminId;
        private String username;
        private String email;
        private String password;
        private List<PendingProducts> reviewedRequests;

        public Builder setAdminId(Long adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setReviewedRequests(List<PendingProducts> reviewedRequests) {
            this.reviewedRequests = reviewedRequests;
            return this;
        }

        public Builder copy(Administrator administrator) {
            this.adminId = administrator.adminId;
            this.username = administrator.username;
            this.email = administrator.email;
            this.password = administrator.password;
            this.reviewedRequests = administrator.reviewedRequests;
            return this;
        }

        public Builder builder(Administrator admin) {
            this.adminId = admin.getAdminId();
            this.username = admin.getUsername();
            this.email = admin.getEmail();
            this.password = admin.getPassword();
            this.reviewedRequests = admin.getReviewedRequests();
            return this;
        }

        public Administrator build() {
            return new Administrator(this);
        }
    }
}
