package cyker.springframework.api.v1.mapper;

import cyker.springframework.spring5mvcrest.api.v1.mapper.CategoryMapper;
import cyker.springframework.spring5mvcrest.api.v1.model.CategoryDTO;
import cyker.springframework.spring5mvcrest.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryMapperTest {

    public static final long ID = 1L;
    public static  final String NAME = "Joe";
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
    @Test
    public void categoryToCategoryDTO() throws Exception {

        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }
}
