package servlets;

import base.AccountService;
import base.UserProfile;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccountServiceImplement implements AccountService {

    private final Map<String, UserProfile> signedUpUsers = new HashMap<>();

    @Override
    public void signUp(String login, String password) {
        signedUpUsers.put(login, new UserProfile(login, password));
    }
    @Override
    public boolean signIn(String login, String password) {
        UserProfile profile = signedUpUsers.get(login);
        return profile != null && profile.getPassword().equals(password);
    }
}
