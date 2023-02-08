SELECT IF(Grade>7,Name,"NULL"),Grade,Marks FROM Students
INNER JOIN Grades ON Marks
BETWEEN Min_Mark and Max_Mark
ORDER BY Grade DESC,Name,Marks
