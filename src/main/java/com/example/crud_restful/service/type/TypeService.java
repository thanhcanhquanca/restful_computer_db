package com.example.crud_restful.service.type;

import com.example.crud_restful.model.DTO.TypeDTO;
import com.example.crud_restful.model.Type;
import com.example.crud_restful.repository.ITypeRepository;
import com.example.crud_restful.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypeService implements ITypeService {

    @Autowired
    private ITypeRepository typeRepository;

    @Override
    public Iterable<Type> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public Type save(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public Optional<Type> findById(Long id) {
        return typeRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        typeRepository.deleteTypeById(id);
    }

    @Override
    public Iterable<TypeDTO> getType() {
        return typeRepository.getType();
    }
}