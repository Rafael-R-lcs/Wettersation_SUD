package Data;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class WetterData {

    private float temp;

    private float humidity;

    private float air_pressure;


}
