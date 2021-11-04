package pros.unicam.spm2021.practice.JUnit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @Tag("UnitTest")
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    @Test
    @Disabled
    public void shouldAnswerWithTrue2()
    {
        assertTrue( false );
    }
}
