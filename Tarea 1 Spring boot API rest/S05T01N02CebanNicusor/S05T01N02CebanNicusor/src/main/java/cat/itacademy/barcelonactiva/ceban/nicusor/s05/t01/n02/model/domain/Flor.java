package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Flor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flor_ID;
    private String nameFlor;
    private String countryFlor;

    public Flor(String nameFlor, String countryFlor) {
        this.nameFlor = nameFlor;
        this.countryFlor = countryFlor;
    }

}
