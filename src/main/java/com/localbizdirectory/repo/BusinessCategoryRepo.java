package com.localbizdirectory.repo;

import com.localbizdirectory.entity.BusinessCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessCategoryRepo extends JpaRepository<BusinessCategory, Integer> {
}
