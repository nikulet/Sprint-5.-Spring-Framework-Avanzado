package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.controllers;

import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.dto.FlorDto;
import cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.services.FlorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flor")
public class FlorController {

    @Autowired
    private FlorService florServiceController;

    @PostMapping("/add")
    public ResponseEntity<String> addFlor(@RequestBody FlorDto florDato) {
        florServiceController.save(florDato);
        return ResponseEntity.ok("Flor añadida correctamente");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFlor(@RequestBody FlorDto florDato) {
        florServiceController.updateFlor(florDato);
        return ResponseEntity.ok("Datos Actualizados");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<FlorDto> getOne(@PathVariable int id) {
        FlorDto dtoflor = florServiceController.getById(id);
        return ResponseEntity.ok(dtoflor);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<FlorDto>> allFlor() {
        List<FlorDto> flors = florServiceController.getAllFlor();
        return ResponseEntity.ok(flors);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFlor(@PathVariable int id) {
        florServiceController.deleteFlor(id);
        return ResponseEntity.ok("Flor eliminada correctamente");
    }
}
