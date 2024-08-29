package com.example.RestfulAndExceptionHandling.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;

public interface BaseController <I, D>{
    ResponseEntity<D> create(I dto);
    ResponseEntity<D> update(I dto);
    ResponseEntity<D> delete(int id);
    ResponseEntity<D> getById(int id);
    ResponseEntity<List<D>> getAll();
}
