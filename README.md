# app_scala_quickstart_cli
![build status](https://github.com/praisetompane-utilities/app_scala_quickstart_cli/actions/workflows/app_scala_quickstart_cli.yaml/badge.svg) <br>

generic scala CLI template project for file processing.

# project layout

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

# file interface(data format)

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

# dependencies
- java 11

# build
```shell
# from root directory
make
```

# usage

- clone repository to machine
- run commands below to see output with sample file

```shell
# from root directory
./release/app_scala_quickstart_cli.jar  ./release/sample_input.txt
```

- for your own file, run from the release folder with command format below

```
    ./app_scala_quickstart_cli.jar <your_file_name>
```
