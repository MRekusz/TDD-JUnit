public class UserService {

    String [] users;

    public UserService(String [] users) {
        this.users = users;
    }

    public boolean isExist(String login) {
        for (String user : users) {
            if (user.equals(login)) {
                return true;
            }
        }
        return false;
    }

    public int getUsersCount() {
        return users.length;
    }


}
