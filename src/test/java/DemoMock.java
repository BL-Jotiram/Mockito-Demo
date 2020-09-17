import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Matchers.any;

import static org.mockito.Mockito.when;

public class DemoMock {

    @Mock
    AnimalRepository animalRepo ;
    
    @InjectMocks
    SoundProvider soundProvider = new SoundProvider();

   
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void givenAnimal_ShouldReturnSound() {
        when(animalRepo.getSound(any())).thenReturn("Meow");
        String catSound = soundProvider.printElement("cat");
        Assert.assertEquals("Meow", catSound);
    }
}
