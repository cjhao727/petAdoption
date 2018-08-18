package service;

import com.j.dao.PetDao;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class PetSearchServiceTest {
    @Mock
    private PetDao petDao;

    @InjectMocks
    private PetSearchService petSearchService;

    @Test
    public void testPetSearchService() {
        //get all pets

        //get pets by location

        //get pets by gender

        //get pets by type

        //get pets by compound conditions
    }
}
