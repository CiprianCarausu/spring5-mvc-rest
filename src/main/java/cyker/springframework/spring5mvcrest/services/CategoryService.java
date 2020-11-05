package cyker.springframework.spring5mvcrest.services;

import cyker.springframework.spring5mvcrest.api.v1.model.CategoryDTO;

import java.util.List;


public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
