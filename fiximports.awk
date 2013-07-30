#!/usr/bin/awk -f
BEGIN {FS=","}
{print "insert into annotation(id,api,name,usage) values(", --i, "'" $1 "','" $2 "','" $3 "')"}
