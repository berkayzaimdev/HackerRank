SELECT id,age,coins_needed,power
FROM Wands W INNER JOIN Wands_Property WP ON W.code = WP.code
WHERE WP.is_evil=0
AND W.coins_needed = 
(SELECT MIN(coins_needed) FROM Wands W2 
INNER JOIN Wands_Property AS WP2 ON W2.code = WP2.code
WHERE W.power = W2.power AND WP.age = WP2.age)
ORDER BY W.POWER DESC, WP.AGE DESC;
