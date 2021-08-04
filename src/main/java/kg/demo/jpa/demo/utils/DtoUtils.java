package kg.demo.jpa.demo.utils;

import kg.demo.jpa.demo.dto.DTOEntity;
import org.modelmapper.ModelMapper;

public class DtoUtils {

    public DTOEntity convertToDto(Object obj, DTOEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertToEntity(Object obj, DTOEntity mapper) throws NumberFormatException {
        try {
            Object map = new ModelMapper().map(mapper, obj.getClass());
            return map;
        } catch (Exception e) {
            return null;
        }


    }

}
