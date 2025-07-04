package OOPS;

public class Access_Modifier {
    public static void main(String[] args) {
        accessModifier Myacc = new accessModifier();
        Myacc.username = "Vidyansh";
        Myacc.setPassword("Vidyansh123");
    }
}

class accessModifier {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
