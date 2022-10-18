# db-diff-analyser
A tool to compare two databases during migrations.

## Analyser

The analyser verifies that two databases have the same:
* Table:
  * Names;
  * Columns;
* Data.

### Databases

The following databases are supported in the analysis :
* MySQL.

## Build

`gradlew build`

## Configuration
Depending on the database types, your application.yml file should look like one of the following.

Mixing database types is possible, but results can't be guaranteed do to complexity issues.
 
### MySQL

``

## Run

`java -jar ./build/libs/dbdiffanalyser-0.0.1-SNAPSHOT.jar —Dspring.config.additional-location=<application.yml-location>`