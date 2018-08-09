package base;

public interface AccountService {
    public boolean signIn(String login, String password);
    public void signUp(String login, String password);
}
