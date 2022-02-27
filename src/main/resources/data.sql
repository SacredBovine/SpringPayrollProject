INSERT INTO department(department_id, department_name)
    VALUES (1, 'testing');
INSERT INTO department(department_id, department_name)
VALUES (2, 'payroll');
INSERT INTO department(department_id, department_name)
VALUES (3, 'executive');
INSERT INTO role(role_id, role_name)
    VALUES(1, 'employee');
INSERT INTO role(role_id, role_name)
    VALUES(2, 'manager');
INSERT INTO role(role_id, role_name)
    VALUES(3, 'vice president');
INSERT INTO employee(first_name, last_name, department_id, role_id, email_address, phone_number, salary)
    VALUES('Steven', 'Hanley', 1, 1, 'mail@mail.com', '123-456-7890', 40000);
