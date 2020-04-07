package services;

import blogentity.Post;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostsService {

  static List<Post> posts = new ArrayList<>(
      Arrays.asList(
          new Post(1, "DataType", "SampleText"),
          new Post(2, "Classes", "SampleText"),
          new Post(3, "Object", "SampleText"),
          new Post(4, "Access Specifiers", "SampleText"),
          new Post(5, "OOP Overview", "SampleText"))
  );

  //GET posts
  public List<Post> getPosts() {
    return posts;
  }

  //GET post
  public Post getPost(int id) {
    for (Post post : posts) {
      if (post.getPostID() == id) {
        return post;
      }
    }
    return null;
  }

  //CREATE post
  public void addPost(Post listElement){
    posts.add(listElement);
  }

  //UPDATE post
  public void updatePost(Post post, int id){
    for(int i = 0; i < posts.size(); i++){
        Post tempPost = posts.get(i);
        if(tempPost.getPostID() == id){
          posts.set(i, post);
        }
    }
  }

  //DELETE post
  public void deletePost(int id){

    for(int i=0; i<posts.size(); i++){
      Post tempPost = posts.get(i);
      if(tempPost.getPostID() == id){
        posts.remove(i);
        return;
      }
    }
  }
}


