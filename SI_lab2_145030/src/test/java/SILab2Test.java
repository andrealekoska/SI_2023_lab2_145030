import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SILab2Test {
    @Test
    void everyBranchTest(){
        List<String> slucaj1 =  List.of();

        IllegalArgumentException informationMissing;

        //1-2,2-3,3-25
        informationMissing= assertThrows(IllegalArgumentException.class, () -> SILab2.function(slucaj1));
        return assertTrue(informationMissing.getMessage().contains("Mandatory information missing!"));

        @Test
            void multipleConditions(){
            IllegalArgumentException ;
            List<String> slucaj2=List.of("a","12"," ");
            sameUsameP=assertThrows(IllegalArgumentException.class, () -> SILab2.function(slucaj2));
            return assertTrue(informationMissing.getMessage().contains("User name and password are the same"));

        }

        }









    }
}
