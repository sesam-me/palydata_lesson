package Sta;

public class Marine {

    public Marine(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }

    private int id;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

