package com.backlink.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ServiceObject<T> {
	List<T> findAll();

	T findById(String id);

	T save(T t);

	T update(T t);

	boolean delete(T t);

}
