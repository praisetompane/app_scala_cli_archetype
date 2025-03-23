# app_scala_quickstart_cli
![build status](https://github.com/praisetompane-utilities/app_scala_quickstart_cli/actions/workflows/app_scala_quickstart_cli.yaml/badge.svg) <br>

## Objectives
- A plain Scala CLI archetype project with common patterns to enable focusing on the unique aspects of your application instead of setup ceremony. 

## Project Structure
- core
  - The business logic of the application lives in this module.
- model
  - The models to represent the domain live in this module.
- gateway
  - all external interaction objects(e.g. files, external APIs etc) live in this module
- main
  - cli
    - the command line interface into the application lives in this module
  - if one were to need to expose this service over REST, gRPC, as library etc, they simply add a module here that provides the interface they want expose.

## File interface(data format)
  - definitions:
    - ModelA = AlphabetName Score
      - AlphabetName can incldue spaces
    - Delimiter = ", " => comma and one space
  - The content of modelA line is:
    - pattern: ModelADelimiter ModelA
    - Example:
      - ObjectA 1, ObjectB 0
        - ModelA_A = ObjectA 1
        - Delimiter = ", "
        - ModelA_B = FC ObjectB 0

## Dependencies
- Java Development Kit

## Setup Instructions
- The repository is configured to use [devcontainers](https://containers.dev) for development.
    - [Developing inside a Container](https://code.visualstudio.com/docs/devcontainers/containers)

# Build
```shell
# from root directory
make
```

# Run Program
```shell
./release/app_scala_quickstart_cli.jar  ./release/sample_input.txt
```

- for your own file, run from the release folder with command format below
```
./app_scala_quickstart_cli.jar <your_file_name>
```

## Testing
- Run unit and integration tests
```
sbt test
```

## Git Conventions
- **NB:** The main is locked and all changes must come through a Pull Request.
- Commit Messages:
    - Provide concise commit messages that describe what you have done.
        ```shell
        # example:
        git commit -m "feat(core): algorithm" -m"implement my new shiny faster algorithm"
        ```
    - References:
        - https://www.conventionalcommits.org/en/v1.0.0/
        - https://www.freecodecamp.org/news/how-to-write-better-git-commit-messages/


**Disclaimer**: This is still work in progress.
