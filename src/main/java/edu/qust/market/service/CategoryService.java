package edu.qust.market.service;

import edu.qust.market.bean.Category;
import edu.qust.market.bean.CategoryExample;
import edu.qust.market.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> getCategory(){
        CategoryExample categoryExample = new CategoryExample();
        return categoryMapper.selectByExample(categoryExample);
    }

    public Category getCategoryById(Long id){
        CategoryExample categoryExample = new CategoryExample();
        return categoryMapper.selectByPrimaryKey(id);
    }
}
