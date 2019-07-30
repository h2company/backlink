package com.backlink.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ServiceObject<T, V> {
	<T> List<T> findAll();

	T findById(V id);

	T save(T t);

	T update(T t);

	void delete(V t);

}
