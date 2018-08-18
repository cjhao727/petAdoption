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

Now I am ready to code.

- I have created a maven project. Now I am going to start building my spring boot application.
- setup the project.