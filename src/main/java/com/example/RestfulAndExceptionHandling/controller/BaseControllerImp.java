package com.example.RestfulAndExceptionHandling.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.RestfulAndExceptionHandling.service.BaseService;

public class BaseControllerImp<I, D> implements BaseController<I, D> {

    protected final BaseService<I, D> baseService;

    public BaseControllerImp(BaseService<I, D> baseService) {
        this.baseService = baseService;
    }

    @Override
    @PostMapping
    public ResponseEntity<D> create(@RequestBody I dto) {
        D createdEntity = baseService.create(dto);
        return ResponseEntity.ok(createdEntity);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<D> getById(@PathVariable int id) {
        D entity = baseService.getById(id);
        return ResponseEntity.ok(entity);
    }

    @Override
    @PutMapping
    public ResponseEntity<D> update(@RequestBody I dto) {
        D updatedEntity = baseService.update(dto);
        return ResponseEntity.ok(updatedEntity);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<D> delete(@PathVariable int id) {
        baseService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @GetMapping
    public ResponseEntity<List<D>> getAll() {
        List<D> entities = baseService.getAll();
        return ResponseEntity.ok(entities);
    }
}