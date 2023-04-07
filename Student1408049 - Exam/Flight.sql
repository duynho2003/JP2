CREATE DATABASE AirportDB
USE AirportDB

CREATE TABLE Flight (
	AircraftCode varchar(10) primary key,
	[Source] varchar(30),
	Destination varchar(30),
	DepTime DateTime,
	JourneyHrs int
)