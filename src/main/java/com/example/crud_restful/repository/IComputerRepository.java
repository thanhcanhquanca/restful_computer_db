package com.example.crud_restful.repository;

import com.example.crud_restful.model.Computer;
import com.example.crud_restful.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComputerRepository extends CrudRepository<Computer, Long> {
    Iterable<Computer> findAllByComputerType(Type type);

    Page<Computer> findAllByNameContaining(String name, Pageable pageable);

    Page<Computer> findAll(Pageable pageable);
}
