package com.example.demoaop.helper;


import com.example.demoaop.models.Customer;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class Helper {

    public static Specification<Customer> customerHasBirthday(int age1,int age2){
        return new Specification<Customer>() {
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.between(root.get("age"),age1,age2);
            }
        };
    }
}
