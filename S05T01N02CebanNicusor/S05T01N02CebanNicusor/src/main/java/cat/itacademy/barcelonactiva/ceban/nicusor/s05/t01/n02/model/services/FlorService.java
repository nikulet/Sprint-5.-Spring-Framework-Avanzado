package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.dto.FlorDto;

import java.util.List;

public interface FlorService {
    void save(FlorDto flordto);

    void updateFlor(FlorDto flordto);

    void deleteFlor(int florID);

    FlorDto getById(int florID);

    List<FlorDto> getAllFlor();
}
