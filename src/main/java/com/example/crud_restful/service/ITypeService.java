package com.example.crud_restful.service;

import com.example.crud_restful.model.DTO.TypeDTO;
import com.example.crud_restful.model.Type;

public interface ITypeService extends IGenerateService<Type>{
    Iterable<TypeDTO> getType();
}
