SELECT H.hacker_id,H.name FROM Hackers H,Difficulty D,Challenges C,Submissions S
WHERE H.hacker_id = S.hacker_id
AND C.challenge_id = S.challenge_id
AND C.difficulty_level = D.difficulty_level
AND S.score = D.score
GROUP BY H.hacker_id,H.name 
HAVING COUNT(H.hacker_id)>1
ORDER BY COUNT(C.challenge_id) DESC,H.hacker_id
