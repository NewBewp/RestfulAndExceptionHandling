package com.example.RestfulAndExceptionHandling.service;

import java.util.ArrayList;
import java.util.List;

import com.example.RestfulAndExceptionHandling.mapper.EntityMapper;
import com.example.RestfulAndExceptionHandling.repo.BaseRepo;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BaseServiceImp<I, D, E> implements BaseService<I, D> {

    BaseRepo<E, I> repository;
    EntityMapper<E, D> mapper;
    String entityName;

    @Override
    public D save(D dto) {
        E saveEntity = repository.save(mapper.toEntity(dto));
        return mapper.toDto(saveEntity);
    }

    @Override
    public List<D> getAll() {
        // Bước 1: Lấy tất cả các thực thể (entities) từ cơ sở dữ liệu
        List<E> resultList = repository.findAll();

        // Bước 2: Tạo một danh sách để chứa các đối tượng DTO
        List<D> dtoList = new ArrayList<>();

        // Bước 3: Duyệt qua từng thực thể trong danh sách kết quả
        for (E entity : resultList) {
            // Sử dụng mapper để chuyển đổi từng thực thể thành đối tượng DTO
            D dto = mapper.toDto(entity);

            // Thêm đối tượng DTO vào danh sách
            dtoList.add(dto);
        }

        // Bước 4: Trả về danh sách các đối tượng DTO
        return dtoList;
    }

    @Override
    public D update(I id, D dto) {
        // Check if entity exists
        E existingEntity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(entityName + " not found with id: " + id));

        // Update entity fields
        E updatedEntity = mapper.updateEntity(dto, existingEntity);

        // Save and return updated entity
        E savedEntity = repository.save(updatedEntity);
        return mapper.toDto(savedEntity);
    }

    @Override
    public D findById(I id) {
        E result = repository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
        return mapper.toDto(result);
    }

    @Override
    public void delete(I id) {
        repository.deleteById(id);
    }

}