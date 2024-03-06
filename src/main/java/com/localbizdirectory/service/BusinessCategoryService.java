package com.localbizdirectory.service;

import com.localbizdirectory.entity.BusinessCategory;
import com.localbizdirectory.repo.BusinessCategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessCategoryService {
    private final BusinessCategoryRepo repo;

    public List<BusinessCategory> getAllCategories() {
        return repo.findAll();
    }

    public Integer createCategory(BusinessCategory businessCategory) {
        BusinessCategory savedBusinessCat = repo.save(businessCategory);
        return savedBusinessCat.getId();
    }
}
