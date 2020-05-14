package com.springbasics.controller;

import com.springbasics.data.CategoryRepository;
import com.springbasics.data.GifRepository;
import com.springbasics.model.Category;
import com.springbasics.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelmap) {
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelmap.put("categories",allCategories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findById(id);
        modelMap.put("category",category);

        List<Gif> gif= gifRepository.findByCategory(id);
        modelMap.put("gifs",gif);
        return "category";


    }
}
