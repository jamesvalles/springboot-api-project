package mainapp.controller;


import mainapp.entity.Post;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import mainapp.services.CrudService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestAPIController {

  Logger logger = Logger.getLogger(RestAPIController.class.getName());


  @Autowired
  private CrudService postsService;

  @RequestMapping(method = RequestMethod.GET, value = "/posts")
  public List<Post> getPosts() {
    logger.log(Level.INFO, "Getting posts.");
    return postsService.getPosts();
  }

  @RequestMapping("/posts/{id}")
  public Post getPost(@PathVariable("id") int id) {
    logger.log(Level.INFO, "Getting specific post.");
    return postsService.getPost(id);
  }


  @RequestMapping(method = RequestMethod.POST, value = "/posts")
  public void addPost(@RequestBody Post listElement) {
    logger.log(Level.INFO, "Adding post.");
    postsService.addPost(listElement);
  }


  @RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
  public void updatePost(@RequestBody Post post) {
    logger.log(Level.INFO, "Updating post.");
    postsService.updatePost(post);

  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
  public void updatePost(@PathVariable("id") int id) {
    logger.log(Level.INFO, "Delete specific post.");
    postsService.deletePost(id);

  }
}
