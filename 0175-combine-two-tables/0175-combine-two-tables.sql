# Write your MySQL query statement below
select p.firstname,p.lastname,A.city,A.state from Person p LEFT join Address A on p.personId=A.personId;