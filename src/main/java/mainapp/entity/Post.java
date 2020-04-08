package mainapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")

public class Post {
  @Id
  @Column(name = "id")
  int postID;


  @Column(name = "title")
  String title;

  @Column(name = "body")
   String body;


  public Post(){

  }
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
