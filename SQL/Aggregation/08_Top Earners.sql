SELECT max(months*salary),count(employee_id) FROM Employee
WHERE months*salary = (SELECT max(months*salary) FROM Employee)
