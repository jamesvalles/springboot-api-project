package mainapp.controller;


import mainapp.blogentity.Post;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import mainapp.services.PostsService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PostsController{

  Logger logger = Logger.getLogger(PostsController.class.getName());


  @Autowired
  private PostsService postsService;

  @RequestMapping("/posts")
  public List<Post> getPosts() {

    logger.log(Level.INFO, "Getting posts.");
    return postsService.getPosts();
  }

  @RequestMapping("/posts/{id}")
  public Post getPost(@PathVariable("id") int id) {
    return postsService.getPost(id);
  }


  @RequestMapping(method = RequestMethod.POST, value="/posts")
  public void addPost(@RequestBody Post listElement) {
    postsService.addPost(listElement);
  }



  @RequestMapping(method = RequestMethod.PUT, value="/posts/{id}")
  public void updatePost(@RequestBody Post post){
    postsService.updatePost(post);

  }

  @RequestMapping(method = RequestMethod.DELETE, value="/posts/{id}")
  public void updatePost(@PathVariable("id") int id){
   postsService.deletePost(id);

  }
}
