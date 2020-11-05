package cyker.springframework.spring5mvcrest.api.v1.mapper;

import cyker.springframework.spring5mvcrest.api.v1.model.CategoryDTO;
import cyker.springframework.spring5mvcrest.domain.Category;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
