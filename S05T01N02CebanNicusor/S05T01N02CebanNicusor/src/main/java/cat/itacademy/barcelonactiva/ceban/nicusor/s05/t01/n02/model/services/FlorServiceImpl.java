package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.exceptions.FlorNotFoundException;
import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.domain.Flor;
import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.dto.FlorDto;
import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.repository.FlorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlorServiceImpl implements FlorService {
    @Autowired
    private FlorRepo florRepo;

    @Override
    public void save(FlorDto flordto) {
        Flor flor = new Flor(flordto.getNameFlor(), flordto.getCountryFlor());
        florRepo.save(flor);
    }

    @Override
    public void updateFlor(FlorDto flordto) {
        Flor flor = florRepo.findById(flordto.getFlorID())
                .orElseThrow(() -> new FlorNotFoundException("Flor no encontrada"));
        flor.setCountryFlor(flordto.getCountryFlor());
        flor.setNameFlor(flordto.getNameFlor());
        florRepo.save(flor);
    }

    @Override
    public void deleteFlor(int florID) {
        if (!florRepo.existsById(florID)) {
            throw new FlorNotFoundException("La flor con id: " + florID + " no existe.");
        } else {
            florRepo.deleteById(florID);
        }
    }

    @Override
    public FlorDto getById(int florID) {
        Flor flor = florRepo.findById(florID)
                .orElseThrow(() -> new FlorNotFoundException("Flor no encontrada"));
        FlorDto dtoflor = new FlorDto(flor.getNameFlor(), flor.getCountryFlor());
        dtoflor.setFlorID(florID);
        return dtoflor;
    }

    @Override
    public List<FlorDto> getAllFlor() {
        List<Flor> florList = florRepo.findAll();
        return florList.stream()
                .map(flor -> {
                    FlorDto dtoflor = new FlorDto(flor.getNameFlor(), flor.getCountryFlor());
                    dtoflor.setFlorID(flor.getFlor_ID());
                    return dtoflor;
                })
                .collect(Collectors.toList());
    }
}
