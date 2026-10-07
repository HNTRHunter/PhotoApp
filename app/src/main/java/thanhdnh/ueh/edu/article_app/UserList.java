package thanhdnh.ueh.edu.article_app;

import java.util.ArrayList;

public class UserList {
  private ArrayList<User> users;

  public UserList(ArrayList<User> users) {
    this.setUsers(users);
  }

  public ArrayList<User> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<User> users) {
    this.users = users;
  }
}
