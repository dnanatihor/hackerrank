select distinct city from station where city not like '[a,e,i,o,u]%[a,e,i,o,u]' order by city;
