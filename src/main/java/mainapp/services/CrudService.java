package mainapp.services;

import mainapp.entity.Post;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainapp.repository.CrudOperationRepository;

@Service
public class CrudService {


  @Autowired
  private CrudOperationRepository repo;


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

  //CREATE single post
  public void addPost(Post listElement) {
    repo.save(listElement);
  }

  //UPDATE specific post
  public void updatePost(Post post) {
    repo.save(post);
  }

  //DELETE post by id
  public void deletePost(int id) {
    repo.deleteById(id);
  }
}


