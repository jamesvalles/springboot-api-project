package blogentity;

public class Post {
  int postID;
  String title;
  String body;

  public Post(int postID, String title, String body) {
    this.postID = postID;
    this.title = title;
    this.body = body;
  }

  public int getPostID() {
    return postID;
  }

  public void setPostID(int postID) {
    this.postID = postID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Post{" +
        "postID=" + postID +
        ", title='" + title + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
