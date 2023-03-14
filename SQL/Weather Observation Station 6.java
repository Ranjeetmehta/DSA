https://www.hackerrank.com/challenges/weather-observation-station-6/problem?isFullScreen=true

Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.

Input Format

The STATION table is described as follows:











select  city from station
where left(city,1) in ('a','e','i','o','u')
