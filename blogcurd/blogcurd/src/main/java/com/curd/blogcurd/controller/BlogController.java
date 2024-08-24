package com.curd.blogcurd.controller;

import com.curd.blogcurd.model.BlogModel;
import com.curd.blogcurd.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/blog")
public class BlogController {
    //declare the services abject
    @Autowired
    private BlogServices blogServices;

   // call the add blog services
    @PostMapping()
    public BlogModel addBlog (@RequestBody BlogModel blogModel){
        return blogServices.addBlog( blogModel );
    }

    @GetMapping()
    public List<BlogModel> getBlogs(){
        return blogServices.getBlogs();
    }

    @DeleteMapping(value = "/{blogId}")
    public void deleteBlog(@PathVariable("blogId") int blogId)
    {
        blogServices.deleteBlog(blogId);
   }

    @PutMapping(value =  "/{blogId}")
    public BlogModel updateBlog(@PathVariable("blogId") int blogId,
                                   @RequestBody BlogModel model)
    {
        return blogServices.updateBlog(blogId,model);
    }
//     @GetMapping("/name")
//    public String myName(){
//         return "Sakshi";
//     }
//    @GetMapping("/add")
//    public String add(){
//         Scanner sc = new Scanner( System.in );
//        System.out.println("enter A ");
//        int a = sc.nextInt();
//        System.out.println("enter B");
//        int b= sc.nextInt();
//        int add = a + b;
//        return "add = "+(add);
//    }

}
