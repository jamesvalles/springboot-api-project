package mainapp.services;

import mainapp.blogentity.Post;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainapp.repository.PostRepository;

@Service
public class PostsService {


 @Autowired
  private PostRepository repo;


  //GET all posts
  public List<Post> getPosts() {
    List<Post> list = new ArrayList<>();
    for (Post post : repo.findAll()) {
      list.add(post);
    }
    return list;
  }


  //GET single post by id
  public Post getPost(int id) {
  return repo.findById(id).get();
    }


  //CREATE post
  public void addPost(Post listElement){
    repo.save(listElement);
  }

  //UPDATE post
  public void updatePost(Post post){
   repo.save(post);
  }

  //DELETE post
  public void deletePost(int id){
    repo.deleteById(id);
  }
}


