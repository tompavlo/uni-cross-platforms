CREATE TABLE Department(
   departmentId INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Employee(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    departmentId INT,
    FOREIGN KEY (departmentId) REFERENCES Department(departmentId)
);