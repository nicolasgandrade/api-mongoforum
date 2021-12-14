# MongoForum - MongoDB API Rest
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)
![Conventional Commits](https://img.shields.io/badge/Conventional%20Commits-1.0.0-yellow.svg)

## :point_right: About
MongoForum is an API rest where users can make posts and comment on these posts. The application was made using SpringBoot, SpringData and MongoDB as the database.

## :cd: Getting Started
1. Create a database in MongoDB with a collection called "user", and config the "application.properties" file (src/main/resources/application.properties) 
according to your database. The "post" collection will be created automatically when the application starts.
2. Run the application using your favorite IDE with SpringBoot.

## :link: Endpoints
### :man: users
1. Return all the users in the database (get - 200 ok) || Insert a new user (post - 201 created)
```
(GET and POST) - http://localhost:8080/users

Post JSON format:
{
  "name": "xxxx",
  "email": "xxxx@xxx.xxx"
}
```


2. "Action"ById: Return the object (get - 200 ok) || Update the object (put - 204 no content) || Delete the object (delete - 204 no content)
```
(GET - PUT - DELETE) - http://localhost:8080/users/{id}
```


3. Return user's posts by id (get - 200 ok)
```
(GET) - http://localhost:8080/users/{id}/posts
```
