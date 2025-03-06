package com.example.crud_restful.service.computer;

import com.example.crud_restful.model.Computer;
import com.example.crud_restful.model.Type;
import com.example.crud_restful.repository.IComputerRepository;
import com.example.crud_restful.service.IComputerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputerService implements IComputerService {

    @Autowired
    private IComputerRepository computerRepository;


    @Override
    public Iterable<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public Computer save(Computer computer) {
        return computerRepository.save(computer);

    }

    @Override
    public Optional<Computer> findById(Long id) {
        return computerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        computerRepository.deleteById(id);
    }

    @Override
    public Iterable<Computer> findAllByType(Type type) {
        return computerRepository.findAllByComputerType(type);
    }

    @Override
    public Page<Computer> findAll(Pageable pageable) {
        return computerRepository.findAll(pageable);
    }

    @Override
    public Page<Computer> findAllByNameContaining(Pageable pageable, String name) {
        return computerRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<Computer> findAllByName(Pageable pageable, String name) {
        return null;
    }
}
