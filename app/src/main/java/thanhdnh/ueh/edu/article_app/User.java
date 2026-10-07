package thanhdnh.ueh.edu.article_app;

public class User {
  private int id;
  private String uname;
  private String url_profile;
  private String short_bio;
  private String password;

  public User(int id, String uname, String url_profile, String short_bio) {
    this.id = id;
    this.uname = uname;
    this.url_profile = url_profile;
    this.short_bio = short_bio;
  }

  public String getPassword() { return password; }
  public void setPassword(String password) { this.password = password; }

  public int getUser_id() { return id; }
  public void setUser_id(int id) { this.id = id; }

  public String getUser_title() { return uname; }
  public void setUser_title(String uname) { this.uname = uname; }

  public String getUser_image() { return url_profile; }
  public void setUser_image(String url_profile) { this.url_profile = url_profile; }

  public String getUser_description() { return short_bio; }
  public void setUser_description(String short_bio) { this.short_bio = short_bio; }
}
