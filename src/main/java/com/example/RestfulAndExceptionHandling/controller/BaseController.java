package com.example.RestfulAndExceptionHandling.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;

public interface BaseController <I, D>{
    ResponseEntity<D> create(D dto);
    ResponseEntity<D> update(I id, D dto);
    ResponseEntity<Void> delete(I id);
    ResponseEntity<D> getById(I id);
    ResponseEntity<List<D>> getAll();
}
