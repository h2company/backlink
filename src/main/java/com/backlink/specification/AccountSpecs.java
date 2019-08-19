package com.backlink.specification;

import org.springframework.data.jpa.domain.Specification;

import com.backlink.entities.Account;

public interface AccountSpecs {
	public static Specification<Account> isActive() {
		return (root, query, criteriaBuilder) -> {
				return criteriaBuilder.equal(root.get("deleted"), false);
			};
		}
}
