package com.example.RestfulAndExceptionHandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.RestfulAndExceptionHandling.exception.ApiRequestException;
import com.example.RestfulAndExceptionHandling.service.BaseService;

public abstract class BaseControllerImp<I, D> implements BaseController<I, D> {

    protected final BaseService<I, D> baseService;

    @Autowired
    public BaseControllerImp(BaseService<I, D> baseService) {
        this.baseService = baseService;
    }

    @Override
    @PostMapping
    public ResponseEntity<D> create(@RequestBody D dto) {
        D createDto = baseService.save(dto);
        if(createDto == null){
            throw new ApiRequestException("Failed to create data");
        }
        return ResponseEntity.ok(createDto);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable I id, @RequestBody D dto) {
        D updateDto = baseService.update(id,dto);
        if(updateDto == null){
            throw new ApiRequestException("Failed to update data");
        }
        return ResponseEntity.ok(updateDto);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable I id) {
        D entity = baseService.findById(id);
        if(entity == null){
            throw new ApiRequestException("Failed to delete data");
        }
        baseService.delete(id);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<D> getById(@PathVariable I id) {
        D entity = baseService.findById(id);
        if(entity == null){
            throw new ApiRequestException("No data found");
        }
        return ResponseEntity.ok(entity);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<D>> getAll() {
        List<D> entities = baseService.getAll();
        if(entities.isEmpty()){
            throw new ApiRequestException("No data found");
        }
        return ResponseEntity.ok(entities);
    }

}