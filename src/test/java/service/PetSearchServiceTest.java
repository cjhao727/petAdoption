package service;

import com.j.dao.PetDao;
import com.j.domain.Pet;
import com.j.service.PetSearchService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class PetSearchServiceTest {
    @Mock
    private PetDao petDao;

    @InjectMocks
    private PetSearchService petSearchService;

    @Test
    public void testPetSearchService() {
        Pet[] mockData = {
                new Pet(1, "Snoopy", "dog", "male", "97205", true, null),
                new Pet(2, "Willow", "cat", "female", "97205", true, null),
                new Pet(3, "Yoda", "dog", "neutered", "90210", true, null),
                new Pet(4, "Lassie", "dog", "spayed", "90210", true, null),
                new Pet(5, "Fluffly", "rabbit", "female", "97215", true, null),
                new Pet(6, "Rhea", "cat", "spayed", "97215", true, null),
                new Pet(7, "Lese", "cat", "spayed", "97215", true, null),
                new Pet(8, "Rascal", "dog", "male", "97205", true, null)
        };

        List<Pet> mockResponse = Arrays.asList(mockData);

        //get all pets
        when(petDao.getAllPets()).thenReturn(mockResponse);
        List<Pet> testResponse = petSearchService.getAllPets();
        assertEquals(mockResponse, testResponse);

        //get pets by location

        //get pets by gender

        //get pets by type

        //get pets by compound conditions
    }
}
