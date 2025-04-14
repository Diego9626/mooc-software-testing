package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CaesarShiftCipherTest {
    @Test
    public void shiftSimpleTextBy3() {
        CaesarCipherShift ccs = new CaesarCipherShift();
        Assertions.assertEquals("def", ccs.caesarCipher("abc", 3));
    }

    @Test
    public void shiftWrapAround() {
        CaesarCipherShift ccs = new CaesarCipherShift();
        Assertions.assertEquals("abc", ccs.caesarCipher("xyz", 3));
    }

    @Test
    public void invalidCharacterShouldReturnInvalid() {
        CaesarCipherShift ccs = new CaesarCipherShift();
        Assertions.assertEquals("inválido", ccs.caesarCipher("abc!", 3));
    }

}
