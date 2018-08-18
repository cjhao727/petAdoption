# Pet Adoption

### Analysis
To solve this problem, I'd like to build a micro-service.
Base on the instruction, I have some ideas listed out as below.

1. I'd like to build a N tier MVC application.
2. I am thinking of having a pet domain as below to start with.
    ```
    pet {
       id;
       name;
       type;
       gender;
       zipCode;
    }
    ```
3. I am going to build a petSearchService to implement my solution.
4. Also I will create an end point to work with petSearchService.
5. If I get extra time, I'd like to create one more service for pet adoption. 
In order to do that, I'd like to add two more domains and update the pet obj.
    ```
    Pet {
       id;
       name;
       type;
       gender;
       zipCode;
       
       okToAdopt;
       adoptionRecord;
    }
    
    AdoptionRecord {
        adopter;
        adoptionFee;
        adoptionDate;
    }
    
    
    Adopter {
        name;
        age;
        address;
        contact;
    }
    
    ```
### Now I am ready to code.

- I have created a maven project. Now I am going to start building my spring boot application.
1. setup the project.
2. create domain.
3. create DAO layer. Since I do not need to incorporate a database, I am going to intake the fake data.
4. Start building search service.
5. By following the TDD, PetSearchServiceTest has been created.
6. Due to the time, I am not going to commit step by step.


### Testing Methodology
Finished the basic tasks with unit tests.

For integration test, trying to add controller tests if I get time.

Setup swagger to test the application.
It could be considered as integration test.
For automated integration test, I would like to use POSTMan script to do the test.


### Start working on the advanced adoption feature.

- like the original analysis, I'd like to have adopter and adoptionRecord to assist.
- To me, basic it is a CRUD issue. Need to manipulate the DAO object.

Due to the time, I am not going to do TDD for petAdoptService.

Starting thinking about how to do the adoption.

1. need a post request to send the payload which will contain the information to generate the adoption recorder.
2. define the payload.
    ```
    {
        petid: id,
        adoptionRecord: {
            fee,
            date,
            adopter: {
                name,
                age,
                address,
                contact
            }
        }  
    }
    ```
    Base on it, I will need to add one more domain.
    ```
    AdoptRequest {
        petid;
        adoptionRecord;
    }
    ```
 Due to the time, I will stop here.
 Already have idea about how to do adoption.
 
 Going to wrap up and build the runnable jar file.
 
 Having some trouble with java 9 and maven compiler.
 Will submit the jar file as soon as I fix it.