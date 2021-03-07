Feature: verify api service

Scenario Outline: api service validation

Given parameter the api service <id> and <name> and <age> and <salary>
When call the api service
Then validation the employee 

Examples:
|id|name|age|salary|
|1|Nixon|61|65000|
|2|Tiger|65|70000|


