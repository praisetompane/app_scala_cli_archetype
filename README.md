# app_project_x_scala
![build status](https://github.com/praisetompane/app_project_x_scala/actions/workflows/app_project_x_scala.yaml/badge.svg)
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

# usage

- clone repository to machine
- run commands below to see output with sample file

```shell
# from root directory
cd ./release
./app_project_x_scala.jar sample_input.txt
```

- for your own file, run from the release folder with command format below

```
    ./app_project_x_scala.jar <your_file_name>
```
