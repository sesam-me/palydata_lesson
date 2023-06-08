package domain.dto;

public class SignupDto { // #Dto : 데이터 전송 객체 // 매개변수가 너무 길어질 때 여기에 한번에 몰아둠
    private String username;
    private String password;
    private String name;

    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


}
