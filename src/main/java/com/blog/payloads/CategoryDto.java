package com.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, message = "Min size of category title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10 , message = "Min size of category desc title is 10")
	private String categoryDescription;
}
