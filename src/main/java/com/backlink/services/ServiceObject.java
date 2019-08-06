package com.backlink.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ServiceObject<T, ID> {

	List<T> findAll();

	T findById(ID id);

	T save(T t);

	T update(T t);

	void delete(ID id);

}
