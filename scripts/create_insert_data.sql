create database election;

drop table election.candidates;

create table election.candidates (
   fullName VARCHAR(100) NOT NULL,
   politicalParty VARCHAR(100) NOT NULL,
   constituency VARCHAR(100) NOT NULL,
   totalVotes INT DEFAULT 0,
   PRIMARY KEY ( fullName )
);

insert into election.candidates values('Ramesh Naik','BJP','HYD');

select * from election.candidates;

create table election.voters (
   voterId VARCHAR(100) NOT NULL,
   fullName VARCHAR(100) NOT NULL,
   email VARCHAR(100) NOT NULL,
   PRIMARY KEY ( voterId )
);

insert into election.voters values('AYZ999056','Mahesh','user@gmail.com');
insert into election.voters values('AYZ999060','Raju','user2@gmail.com');

select * from election.voters;

