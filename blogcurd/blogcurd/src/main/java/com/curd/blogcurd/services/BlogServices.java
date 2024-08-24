package com.curd.blogcurd.services;

import com.curd.blogcurd.dao.BlogDao;
import com.curd.blogcurd.model.BlogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Component
public class BlogServices {
    //add blog
    //delete blog
    //update blog
    //get specific blog
    //get all blog
    //first blog id is 1
    @Autowired
    private BlogDao dao;
//    private int blogId =1;
//    //declare List for storing all blog
//    List<BlogModel> list = new CopyOnWriteArrayList<>();
//    //create method for add blog
    public BlogModel addBlog(BlogModel blogModel){
//        blogModel.setBlogId(blogId);
//        list.add(blogModel);
//        blogId++;
        return dao.save(blogModel);
    }
    //get all blogs
    public List<BlogModel> getBlogs(){
       return dao.findAll();
    }
    public void deleteBlog(int blogId){
//        list.stream()
//                .forEach(t -> {
//                    if (t.getBlogId() == blogId)
//                    {
//                        list.remove(t);
//                    }
//                });
      dao.deleteById(blogId);
    }

    //update the blog
    public BlogModel updateBlog(int blogId, BlogModel model)
    {
//        list.stream().forEach(t -> {
//            if (t.getBlogId() == blogId){
//                t.setBlogTitle(model.getBlogTitle());
//                t.setBlogDesc(model.getBlogDesc());
//                t.setBlogDate(model.getBlogDate());
//                t.setAuthorName(model.getAuthorName());
//            }
//        });
//
//        return list.stream()
//                .filter(t -> t.getBlogId() == blogId)
//                .findFirst()
//             .get();
        model.setBlogId( blogId );
        return dao.save( model );
    }

}
