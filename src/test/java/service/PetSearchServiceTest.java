package service;

import com.j.dao.PetDao;
import com.j.domain.Pet;
import com.j.service.PetSearchService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

public class PetSearchServiceTest {
    @Mock
    private PetDao petDao;

    @InjectMocks
    private PetSearchService petSearchService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

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
        doReturn(mockResponse).when(petDao).getAllPets();

        List<Pet> testGetAllPets = petSearchService.getAllPets();
        assertEquals(mockResponse, testGetAllPets);

        List<Pet> findPetsByLocation = petSearchService.findPetByLocation("97205");
        assertEquals(mockResponse.stream().filter(m -> m.getZipCode().equals("97205")).collect(Collectors.toList()),
                findPetsByLocation);

        List<Pet> findPetByType = petSearchService.findPetByType("dog");
        assertEquals(mockResponse.stream().filter(m -> m.getType().equals("dog")).collect(Collectors.toList()),
                findPetByType);

        List<Pet> findPetByGender = petSearchService.findPetByGender("male");
        assertEquals(mockResponse.stream().filter(m -> m.getGender().equals("male")).collect(Collectors.toList()),
                findPetByGender);

        //due to the time limitation, I am not going to test compound conditions
    }
}
