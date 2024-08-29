package com.example.RestfulAndExceptionHandling.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.RestfulAndExceptionHandling.repo.BaseRepo;

public class BaseServiceImp<I, D> implements BaseService<I, D> {
    @Autowired
    private BaseRepo<D, Integer> baseRepo;

    @Override
    public D create(I entity) {
        // TODO: Implement conversion from I to D if necessary
        D domainEntity = convertToEntity(entity);
        return baseRepo.save(domainEntity);
    }

    @Override
    public D getById(int id) {
        return baseRepo.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
    }

    @Override
    public D update(I entity) {
        // TODO: Implement conversion from I to D if necessary
        D domainEntity = convertToEntity(entity);
        return baseRepo.save(domainEntity);
    }

    @Override
    public void delete(int id) {
        baseRepo.deleteById(id);
    }

    @Override
    public List<D> getAll() {
        return baseRepo.findAll();
    }

    // Helper method to convert Input type to Domain type
    protected D convertToEntity(I input) {
        // TODO: Implement conversion logic
        throw new UnsupportedOperationException("Conversion from Input to Domain not implemented");
    }
}