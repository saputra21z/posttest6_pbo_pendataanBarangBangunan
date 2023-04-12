
package posttest6;


public final class admin implements akun {
    private String username, password;
    
    @Override
    public void admin() {
        username = "admin";
        password = "admin123";
    }

    @Override
    public String getUsername() {
    return username;

    }

    @Override
    public String getPassword() {
    return password;
    }
}
