# Description

This is a sample project for demonstrating [[bi-directional]](https://pactflow.io/bi-directional-contract-testing/) contract testing with Pactflow.

See [[blog post]](https://kreuzwerker.de/post/painless-contract-testing-with-pactflow) for details on usage and find the matching consumer project [[here]](https://github.com/kreuzwerker/blog-bidirectional-contract-testing-consumer)

This Spring Boot app represents the contract "provider", requires Java 17 and for the full experience you will need a trial account to create your own Pact broker.
Add the Pact broker token to your GitHub Action secrets and adjust the broker URL in the .github/workflows/main.yml file.

To have a successful build, you need to disable the tests that are currently failing for demonstration purpose.






