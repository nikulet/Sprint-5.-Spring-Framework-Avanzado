package cat.itacademy.barcelonactiva.ceban.nicusor.s05.t01.n02.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FlorDto implements Serializable {
    @Setter
    private int florID;
    private String nameFlor;
    private String countryFlor;
    private String typeBranch;

    private static final List<String> europCountries = new ArrayList<>(Arrays.asList("ireland","belgium","france",
            "italy","austria","germany","greece", "spain", "bulgaria", "croatia", "republic of cyprus",
            "netherlands","luxembourg", "malta", "poland", "romania", "slovakia", "slovenia", "sweden",
            "finland","czech republic", "denmark", "estonia", "hungary", "portugal", "latvia", "lithuania" ));

    public FlorDto(String nameFlor, String countryFrom) {
        this.nameFlor = nameFlor;
        this.countryFlor = countryFrom;
        this.typeBranch = countryFrom != null && europCountries.contains(countryFrom.toLowerCase()) ? "EU" : "NOT EU";
    }

}
