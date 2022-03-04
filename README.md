New web service based on Spring boot + MongoDB
The goal of the ticket is creating a web service based on Spring Boot, that is provided following REST API:

GET /api/projects – get list of all projects. Result of the request is array of objects in JSON format, where each object has “id” and “name” properties.
POST /api/projects – create a new project. The body of request is JSON object with “name” property.
GET /api/projects/{id} – get one project by id. The result of the request is one object in JSON format with “id” and “name” properties
PUT /api/projects/{id} - update a project by id. The body of request is JSON object with “name” property.
DELETE /api/projects/{id} – delete a project by id
Projects should be saved to MongoDB database using Spring Data library.

Please use annotations for configure the context of Spring application (not XML).

Each project has a unique name.

You can check that all works fine using curl (https://curl.haxx.se/windows/):

Get list of all projects:
Call: curl localhost:8080/api/projects

Result: []

Create new project with name "prj1":
Call: curl -H "Content-Type: application/json" -d "{\"name\":\"prj1\"}" localhost:8080/api/projects

Result:

HTTP/1.1 201

Location: /api/projects/1

Content-Length: 0

Date: ...

Get list of projects again:
Call: curl localhost:8080/api/projects

Result: [{"id":1,"name":"prj1"}]

Get one project data:
Call: curl localhost:8080/api/projects/1

Result: {"id":1,"name":"prj1"}

Rename project by id
Call: curl -H "Content-Type: application/json" -X PUT -d "{\"name\":\" project1\"}" localhost:8080/api/projects/1

Get one project data again:
Call: curl localhost:8080/api/projects/1

Result: [{"id":1,"name":"project1"}]

Remove the project by id:
Call: curl -X DELETE localhost:8080/api/projects/1

Check that project’s list is empty:
Call: curl localhost:8080/api/projects

Result: []
