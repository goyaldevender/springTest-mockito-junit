<h1 align="center">
	<br>
	<img width="200" src="https://cdn.rawgit.com/sindresorhus/awesome/master/media/logo.svg" alt="awesome">
	<br>
</h1>

[![CircleCI](https://circleci.com/gh/springframeworkguru/spring5-mvc-rest.svg?style=svg)](https://circleci.com/gh/springframeworkguru/spring5-mvc-rest)
# Spring Framework 5, Junit and Mockito, Circle CI
  This repository contains codes for testing any application with the help of Junit and Mockito. The CI for this 
  repository is performed with the help of Circle CI.
  
## Junit Tests:
* BasicAnnotationTest
* ClassPropertyTest
* Exception1Test
* Exception2Test
* ExecutionOrderTest
* ListTestInteger
* ListTestObject
* IgnoreTest
* ListTestString
* MapTest
* TimeoutTest

## Mockito Tests:
* Mocking a method in service layer

## Circle CI
* Linked with Circle CI, build running on every commit

## Code under Test
* The code or application you are testing

## Test fixture
* Fixed Set of objects that are required for testing

## Unit testing
* Ideal code coverage is 70% to 80%. After that we get diminishing return because we would be testing useless things 
  like getter and setter.
* Unit test should not bring up the spring context or database.

## Integration test
* They can include spring context, message broker or database.

## Functional test
* Testing the running application, usually the environment is up in the staging environment.
* Testing Pyramid: Base- Unit Test, Middle- Integration Test, Top- Functional Test

## TDD - Test Driven Development

## BDD - Behaviour Driven Development  
* Often implemented with DSLs to create natural language tests
* Tools used: JBehave, Cucumber, Spock

## Mock
* A fake implementation of a class used for testing.

## Spy
* A partial mock, allows you to override select methods of a real class.

## Spring Test and Spring Boot Test
* Set of utilities that spring provides for testing spring and spring boot objects
#### Annotations
* @RunWith( SpringRunner.class ): Run test with Spring Context
* @SpringBootTest: Search for Spring Boot Application for configuration
* @TestConfiguration: Specify a Spring configuration for your test
* @MockBean: Injects Mockito Mock
* @SpyBean: Injects Mockito Spy
* @JsonTest: Creates a Jackson or Gson object mapper via Spring Boot. Used when developing a restful API
* @WebMvcTest: Used to test web context without a full http server
* @DataJpaTest: Used to test data layer with embedded database. So can be used to test the Spring Data JPA
* @TestPropertySource: Configure the property source for the test.
* @JdbcTest: Like @DataJpaTest, but does not configure entity manager.
* @RestClientTest: Creates a mock server for testing rest clients
* @ContextConfiguration: Used to direct Spring how to configure the context for the test.
* @ActiveProfiles: Set which Spring profiles are active for the test.
* @DirtiesContext: Resets the Spring Context after the test (little expensive to do)
* @Transactional: Run test in transaction, rollback when complete by default (We use this when testing database)
* @BeforeTransaction: Action to perform before starting a transaction.
* @After Transaction: Action to run after a transaction.
* @Commit: Specifies the transaction to be committed after the test
* @Rollback: Explicitly specify that the transaction should be rolled back(Generally its done by default)
* @Sql: Specify SQL scripts to run before.

#### Maven-surefire-plugin vs Maven-failsafe-plugin 
* maven-surefire-plugin is designed for running unit tests and if any of the tests fail then it will fail the build 
  immediately.
* maven-failsafe-plugin is designed for running integration tests, and decouples failing the build if there are test 
  failures from actually running the tests.