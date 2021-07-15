import backend.Models.User;

public interface AuthService {

    User login(String username, String password);
}
